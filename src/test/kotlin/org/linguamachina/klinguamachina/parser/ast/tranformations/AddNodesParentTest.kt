package org.linguamachina.klinguamachina.parser.ast.tranformations

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.linguamachina.klinguamachina.parse
import org.linguamachina.klinguamachina.parser.ast.BaseASTNodeVisitor
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.Selectable
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.*
import org.linguamachina.klinguamachina.parser.ast.transformBaseAST

internal class AddNodesParentTest {
    private inner class NodeParentChecker: BaseASTNodeVisitor<Unit> {
        override fun defaultValue() = Unit

        override fun visit(node: ArrayLiteralNode) {
            node.items.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: BlockLiteralNode) {
            node.statements.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: CompileStatementNode) {
            assertSame(node, node.receiver.parent)
            assertSame(node, node.block.parent)
            super.visit(node)
        }

        override fun visit(node: PrimitiveDeclStatementNode) {
            assertSame(node, node.receiver.parent)
            super.visit(node)
        }

        override fun visit(node: LocalReturnNode) {
            assertSame(node, node.expression.parent)
            super.visit(node)
        }

        override fun visit(node: MessageCascadeNode) {
            node.selectors.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: MessageChainNode) {
            node.selectors.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: MessageSelectorNode) {
            node.selectors.forEach {
                assertSame(node, it.parent)
            }
            node.values.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: MessageSendingNode) {
            assertSame(node, node.receiver.parent)
            assertSame(node, node.selectors.parent)
            super.visit(node)
        }

        override fun visit(node: NonLocalReturnNode) {
            assertSame(node, node.expression.parent)
            super.visit(node)
        }

        override fun visit(node: OperationNode) {
            node.expressions.forEach {
                assertSame(node, it.parent)
            }
            super.visit(node)
        }

        override fun visit(node: RootNode) {
            assertNull(node.parent)
            super.visit(node)
        }

        override fun visit(node: StatementExprNode) {
            assertSame(node, node.expression.parent)
            super.visit(node)
        }

        override fun visit(node: UnaryOperationNode) {
            assertSame(node, node.receiver.parent)
            super.visit(node)
        }

        override fun visit(node: VarAssignmentNode) {
            assertSame(node, node.value.parent)
            super.visit(node)
        }

        override fun visit(node: VarDeclarationNode) {
            assertSame(node, node.value.parent)
            super.visit(node)
        }
    }

    @Test
    fun `nodes parent references are added on each node`() {
        val ast = """
            a := 1337;
            b := { | hello |
                hello world: {
                    a = "very cool boi!"
                };
            };
            Object := nil;
            Object subclass: 'MyClass
                   instanceVars: ['noice, 'wow, 'incredible];
        """.trimIndent().parse()
        transformBaseAST(ast)
        NodeParentChecker().visit(ast)
    }
}
