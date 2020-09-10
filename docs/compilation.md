# Compilation

2 kinds of compilation are used, module-level compilation and method-level compilation.

Module-level compilation is somewhat standard as [byte codes](bytecodes.md) are emitted from the AST and that
variables are looked up in the global and module pools.

Method-level compilation is done during the execution of the module-level [byte codes](bytecodes.md).
A special [byte code](bytecodes.md) `compile` is invoked with the method AST node and the receiver as parameters.
