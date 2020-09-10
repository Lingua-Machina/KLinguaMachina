package generation.bytecode.impl

import generation.ModuleCompiler
import interpreter.module.Module
import parsing.ast.nodes.impl.*
import parsing.ast.visitors.BaseASTNodeVisitor

class ModuleBytecodeCompiler(astRootNode: RootNode): ModuleCompiler(astRootNode), BaseASTNodeVisitor<Unit> {
    override fun compile(): Module {
        TODO("Not yet implemented")
    }

    override fun defaultValue() = Unit

    override fun visit(node: ArrayLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: BlockLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: CharLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: CompileStatementNode) {
        super.visit(node)
    }

    override fun visit(node: PrimitiveDeclStatementNode) {
        super.visit(node)
    }

    override fun visit(node: DoubleLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: IntegerLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: LocalReturnNode) {
        super.visit(node)
    }

    override fun visit(node: MessageCascadeNode) {
        super.visit(node)
    }

    override fun visit(node: MessageChainNode) {
        super.visit(node)
    }

    override fun visit(node: MessageSelectorNode) {
        super.visit(node)
    }

    override fun visit(node: MessageSendingNode) {
        super.visit(node)
    }

    override fun visit(node: NonLocalReturnNode) {
        super.visit(node)
    }

    override fun visit(node: OperationNode) {
        super.visit(node)
    }

    override fun visit(node: RootNode) {
        super.visit(node)
    }

    override fun visit(node: StringLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: SymbolLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: UnaryOperationNode) {
        super.visit(node)
    }

    override fun visit(node: VarAssignmentNode) {
        super.visit(node)
    }

    override fun visit(node: VarDeclarationNode) {
        super.visit(node)
    }
}
