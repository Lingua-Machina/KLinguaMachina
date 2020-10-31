package org.linguamachina.klinguamachina.parsing.ast.visitors.impl.astnodeprinter

class ASTStringBuilder(private val indentString: String = "  ") {
    private val stringBuilder = StringBuilder()

    private var indentLevel = 0

    private var disableNextIndent = false

    private fun prefix() =
        Array(indentLevel) { indentString }.joinToString("")

    fun noIndentNext() {
        disableNextIndent = true
    }

    operator fun String.not() {
        disableNextIndent = false
        stringBuilder.append(this)
    }

    operator fun String.unaryMinus() {
        if (!disableNextIndent) {
            !prefix()
        }
        !this
    }

    operator fun String.unaryPlus() {
        -"$this\n"
    }

    fun indent(block: ASTStringBuilder.() -> Unit) {
        indentLevel++
        block()
        indentLevel--
    }

    operator fun invoke(block: ASTStringBuilder.() -> Unit) = block()

    override fun toString() = stringBuilder.toString()
}
