package org.linguamachina.klinguamachina.parsing.ast.antlr

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.linguamachina.klinguamachina.parsing.ast.exceptions.SyntaxError

internal class AntlrASTBuilderTest {

    @Test
    fun `parse integer literal`() {
        // GIVEN an integer literal
        val input = "1337"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse double literal`() {
        // GIVEN a double literal
        val input = "13.37"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse string literal`() {
        // GIVEN a string literal
        val input = "\"hello world!\""

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse char literal`() {
        // GIVEN a char literal
        val input = "\$a"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse symbol literal`() {
        // GIVEN a symbol literal
        val input = "'hello:world"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse identifier literal`() {
        // GIVEN an identifier literal
        val input = "yeet"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse array literal`() {
        // GIVEN an array literal
        val input = "[1, 3, 3, 7, \"hello\", true]"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse block literal`() {
        // GIVEN a block literal
        val input = "{ ^1337 }"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse block literal with params`() {
        // GIVEN a block literal with params
        val input = "{ | yeet nice | ^yeet + nice }"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse simple message sending`() {
        // GIVEN a simple message sending
        val input = "1337 hello"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse simple message sending with params`() {
        // GIVEN a simple message sending with params
        val input = "1337 hello: 'world"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse a message cascade`() {
        // GIVEN a message cascade
        val input = "1337 hello | world | yeet"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse a message chain`() {
        // GIVEN a message cascade
        val input = "1337 hello |> world |> yeet"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse a mixed message sending`() {
        // GIVEN a mixed message sending
        val input = "!1337 hello | (world |> noice: -(1337 + 42)) | yeet"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse a compile statement`() {
        // GIVEN a compile statement
        val input = """
            Hello class >> yeet: hello {
                hello := yeet;
                world = hello;
                <3
            }
        """.trimIndent()

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse a primitive declaration statement`() {
        // GIVEN a primitive declaration statement
        val input = """
            Hello class :: yeet: hello = 'yeetPrimitive:
        """.trimIndent()

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse conditions`() {
        // GIVEN conditions
        val input = "a < b || b > a || a <= b || a >= b || a == b || a != b"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        AntlrASTBuilder().build(input, "<test>")

        // THEN no exception is thrown
    }

    @Test
    fun `parse syntax error`() {
        // GIVEN a non valid input
        val input = "hello how are you"

        // WHEN org.linguamachina.klinguamachina.parsing the input
        // THEN a syntax error exception is thrown
        assertThrows<SyntaxError> {
            AntlrASTBuilder().build(input, "<test>")
        }
    }
}