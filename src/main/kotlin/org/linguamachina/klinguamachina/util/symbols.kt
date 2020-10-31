package org.linguamachina.klinguamachina.util

import org.linguamachina.klinguamachina.interpreter.block.impl.SymbolConstant
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.MessageSelectorNode

fun getSymbolFromSelector(selector: MessageSelectorNode) =
    SymbolConstant(selector.keywords.joinToString(separator = ":").let {
        when (selector.values.size) {
            0    -> it
            else -> "$it:"
        }
    })
