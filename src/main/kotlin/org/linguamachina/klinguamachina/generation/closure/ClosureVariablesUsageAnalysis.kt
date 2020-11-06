package org.linguamachina.klinguamachina.generation.closure

import org.linguamachina.klinguamachina.generation.Scope
import org.linguamachina.klinguamachina.generation.impl.BlockScope
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.*
import org.linguamachina.klinguamachina.parsing.ast.visitors.BaseASTNodeVisitor

class ClosureVariablesUsageAnalysis(
    private val originalScope: Scope
): BaseASTNodeVisitor<Unit> {
    private var fakeScope: Scope = BlockScope()
    private var copies     = mutableSetOf<String>()
    private var copiedRefs = mutableSetOf<String>()
    private var refs       = mutableSetOf<String>()

    override fun defaultValue() = Unit

    private fun enterScope(newScopeTail: Scope) {
        newScopeTail.parent = fakeScope
        fakeScope = newScopeTail
    }

    private fun leaveScope() {
        if (fakeScope.hasParent) {
            fakeScope = fakeScope.parent!!
        } else {
            throw IllegalStateException("Cannot leave topmost scope")
        }
    }

    private fun mustBeCopiedOrReferenced(name: String) =
        // Variable not in current scope ...
        !(fakeScope.hasVariable(name) || fakeScope.hasVariableInOuterScopes(name))
        // ... but in supplied scope...
        && ((originalScope.hasVariable(name) || originalScope.hasVariableInOuterScopes(name))
            // ... and represents a block local variable
            // (as other types of variable can be accessed
            // from anywhere with special bytecodes)
            && originalScope.getVariable(name).scope is BlockScope)

    fun analyse(node: BlockLiteralNode): ClosureVariablesUsage {
        visit(node)
        return ClosureVariablesUsage(copies.toList(), copiedRefs.toList(), refs.toList())
    }

    fun analyse(node: CompileStatementNode): ClosureVariablesUsage {
        TODO("Implement compile statement closure analysis")
    }

    override fun visit(node: IdentifierNode) {
        if (mustBeCopiedOrReferenced(node.value)
                && !refs.contains(node.value)
                && !copiedRefs.contains(node.value)) {
            copies.add(node.value)
        }
    }

    override fun visit(node: VarAssignmentNode) {
        if (mustBeCopiedOrReferenced(node.name)) {
            if (originalScope.getVariable(node.name).isRef) {
                copiedRefs.add(node.name)
            } else {
                if (copies.contains(node.name)) {
                    copies.remove(node.name)
                }
                refs.add(node.name)
            }
        }
        super.visit(node)
    }

    override fun visit(node: VarDeclarationNode) {
        fakeScope.addVariable(node.name)
        super.visit(node)
    }

    override fun visit(node: BlockLiteralNode) {
        enterScope(BlockScope())

        node.paramNames.forEach {
            fakeScope.addVariable(it)
        }
        super.visit(node)

        leaveScope()
    }
}
