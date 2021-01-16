package org.linguamachina.klinguamachina.generation.bytecode

import org.linguamachina.klinguamachina.generation.bytecode.exceptions.UnknownBytecode

enum class Bytecode(
    val immediateArgsCount: Int,
    val stackArgsCount: Int,
    val stackResultCount: Int = 1
) {
    // Data read
    GET_GLOBAL(1, 0),
    GET_MODULE(1, 0),
    GET_INSTANCE(1, 0),
    GET_CLASS(1, 0),
    GET_LOCAL(1, 0),

    // Data write
    SET_GLOBAL(1, 1, 0),
    SET_MODULE(1, 1, 0),
    SET_INSTANCE(1, 1, 0),
    SET_CLASS(1, 1, 0),
    SET_LOCAL(1, 1, 0),

    // Refs
    CREATE_REF(1, 0, 1),
    GET_REF(1, 0, 1),
    SET_REF(1, 1, 0),

    // Message sending
    SEND(1, Int.MAX_VALUE),
    COMPILE(1, 0, 0),
    BIND_PRIMITIVE(2, 1, 0),
    AND(0, 2),
    OR(0, 2),
    ADD(0, 2),
    MINUS(0, 2),
    MUL(0, 2),
    DIV(0, 2),
    MOD(0, 2),
    EQ(0, 2),
    NEQ(0, 2),
    LOWER(0, 2),
    LOWER_EQ(0, 2),
    GREATER(0, 2),
    GREATER_EQ(0, 2),
    POS(0, 1),
    NEG(0, 1),
    NOT(0, 1),

    // Literal values
    ARRAY(1, Int.MAX_VALUE),
    SELF(0, 0),
    CONTEXT(0, 0),
    TRUE(0, 0),
    FALSE(0, 0),
    NIL(0, 0),
    CONST(1, 0),
    CONST_INT(1, 0),

    // Blocks
    CLOSURE(3, Int.MAX_VALUE),
    RETURN(0, 1, 0),
    NON_LOCAL_RETURN(0, 1, 0),

    // Stack manipulation
    POP(0, 1, 0),
    DUP(0, 1, 2),
    SWAP(0, 2, 2);

    companion object {
        fun fromInt(value: Int) = values().firstOrNull { it.ordinal == value }
            ?: throw UnknownBytecode(value)
    }
}
