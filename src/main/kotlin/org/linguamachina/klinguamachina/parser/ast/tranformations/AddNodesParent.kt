package org.linguamachina.klinguamachina.parser.ast.tranformations

import org.linguamachina.klinguamachina.parser.ast.BaseASTNodeVisitor
import org.linguamachina.klinguamachina.parser.ast.nodes.ASTNode
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.*
import java.util.*

class AddNodesParent: BaseASTNodeVisitor<Unit> {
    private val parentStack = Stack<ASTNode>()

    override fun defaultValue() = Unit

    private inline fun parentScope(node: ASTNode, action: ()->Unit) {
        node.parent = if (node is RootNode) null else parentStack.peek()
        parentStack.push(node)
        action()
        parentStack.pop()
    }

    override fun visit(node: RootNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: ArrayLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: BlockLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: CharLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: CompileStatementNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: PrimitiveDeclStatementNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: DoubleLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: IdentifierNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: IntegerLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: LocalReturnNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: MessageCascadeNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: MessageChainNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: MessageSelectorNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: MessageSendingNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: NonLocalReturnNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: OperationNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: StatementExprNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: StringLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: SymbolLiteralNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: UnaryOperationNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: VarAssignmentNode) {
        parentScope(node) {
            super.visit(node)
        }
    }

    override fun visit(node: VarDeclarationNode) {
        parentScope(node) {
            super.visit(node)
        }
    }
}
