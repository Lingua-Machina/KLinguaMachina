package util

import interpreter.block.impl.SymbolConstant
import parsing.ast.nodes.impl.MessageSelectorNode

fun getSymbolFromSelector(selector: MessageSelectorNode) =
    SymbolConstant(selector.keywords.joinToString(separator = ":").let {
        when (selector.values.size) {
            0    -> it
            else -> "$it:"
        }
    })
