package org.linguamachina.klinguamachina.generation.closure

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.linguamachina.klinguamachina.generation.impl.BlockScope
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.*
import org.linguamachina.klinguamachina.*

internal class ClosureVariablesUsageAnalysisTest{
    private lateinit var topScope: BlockScope

    private fun scopeAdd(vararg variables: String) {
        variables.forEach { topScope.addVariable(it) }
    }

    @BeforeEach
    fun setUpTopScope() {
        topScope = BlockScope()
    }

    @Test
    fun `copy variables when they are only read`() {
        scopeAdd("hello")
        val root = """
            { hello print }
        """.parse()

        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(root.closure())

        assertEquals(1, copies.size)
        assertEquals(0, copiedRefs.size)
        assertEquals(0, refs.size)
    }

    @Test
    fun `create references to modified captured variables`() {
        scopeAdd("hello")
        val root = """
            { hello = 1337 }
        """.parse()

        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(root.closure())

        assertEquals(0, copies.size)
        assertEquals(0, copiedRefs.size)
        assertEquals(1, refs.size)
    }

    @Test
    fun `copy references when passed in multiple blocks`() {
        scopeAdd("hello")
        val root = """
            { hello print: { hello = 1337 } }
        """.parse()

        val outerBlock = root.closure()
        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(outerBlock)

        assertEquals(0, copies.size)
        assertEquals(0, copiedRefs.size)
        assertEquals(1, refs.size)

        topScope = BlockScope().let {
            it.addVariableRef(refs[0])
            it.parent = topScope
            it
        }

        val innerBlock = (((root.closure().statements[0] as StatementExprNode)
            .expression as MessageSendingNode).selectors as MessageSelectorNode)
            .values[0] as BlockLiteralNode


        val (copies2, copiedRefs2, refs2) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(innerBlock)

        assertEquals(0, copies2.size)
        assertEquals(1, copiedRefs2.size)
        assertEquals(0, refs2.size)
    }

    @Test
    fun `don't create references when a variable is shadowed 1`() {
        scopeAdd("hello")
        val root = """
            { hello print: { | hello | hello = 1337 } }
        """.parse()

        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(root.closure())

        assertEquals(1, copies.size)
        assertEquals(0, copiedRefs.size)
        assertEquals(0, refs.size)
    }

    @Test
    fun `don't create references when a variable is shadowed 2`() {
        scopeAdd("hello")
        val root = """
            { hello print: { hello := 1337; hello = 42 } }
        """.parse()

        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(topScope)
            .analyse(root.closure())

        assertEquals(1, copies.size)
        assertEquals(0, copiedRefs.size)
        assertEquals(0, refs.size)
    }
}
