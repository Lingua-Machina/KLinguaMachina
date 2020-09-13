package generation.bytecode.impl

import generation.bytecode.AbstractBytecodeCompiler
import generation.exceptions.UnknownVariable
import interpreter.block.impl.CompiledBlock
import interpreter.module.Module
import interpreter.module.impl.BytecodeModule
import parsing.ast.nodes.impl.IdentifierNode
import parsing.ast.nodes.impl.RootNode
import parsing.ast.nodes.impl.VarAssignmentNode
import java.util.LinkedList

@ExperimentalUnsignedTypes
class ModuleBytecodeCompiler(
    private val module: BytecodeModule,
    astRootNode: RootNode
): AbstractBytecodeCompiler<Module>(
        astRootNode, LinkedList<CompiledBlock>(), module.mainBlock) {

    override fun compile(): Module {
        enter()
        visit(astRootNode)
        exit()
        return module
    }

    override fun CompiledBlock.emitVariableResolve(node: IdentifierNode) {
        val variableIndex = getVariable(node.value)
        // TODO check in global pool
        if (variableIndex == null) {
            throw UnknownVariable(node.value, node.position)
        }
        this.emitGetLocal(variableIndex)
    }

    override fun CompiledBlock.emitVariableAssign(node: VarAssignmentNode) {
        val variableIndex = getVariable(node.name)
        // TODO check in global pool
        if (variableIndex != null) {
            visit(node.value)
            blockStack.last.emitSetLocal(variableIndex)
        } else {
            throw UnknownVariable(node.name, node.position)
        }
    }
}
