package util

private val IDENT = "[a-zA-Z_][a-zA-Z0-9_]*"

// Keep in sync with grammar
val String.isMessageSelector
    get() = this.matches(Regex("$IDENT(:($IDENT:)*)?"))

val String.messageSelectorArity
    get() = this.filter { it == ':' }.length

fun getSelectorFromKeywords(keywords: List<String>, params: Boolean) =
    keywords.joinToString(separator = ":").let {
        if (params)
            "$it:"
        else
            it
    }
