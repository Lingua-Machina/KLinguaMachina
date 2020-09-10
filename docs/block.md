# CompiledBlock, PrimitiveBlock, MethodContext and BlockContext

## CompiledBlock

A CompiledBlock contains the compiled [byte codes](bytecodes.md) of its instructions.
A CompiledBlock also links to the original code and contains the data needed to map each bytecode
to a particular line into the source code.
A CompiledBlock is composed of a literal pool used to contain indexed literals. These literals
are referenced in the byte codes by their index. The literal pool contains the messages names,
global/shared variables names, strings, symbols, chars and numbers used in the block.
A CompiledBlock also contains references to [pools](pools.md).
A CompiledBlock contains a collection of exceptions it could encounter and their respective handlers.

## PrimitiveBlock

A PrimitiveBlock is a special kind of block referencing Kotlin code.

## MethodContext

A MethodContext contains its own *Program Counter* (PC) and *Stack Pointer* (SP).
A MethodContext references its ***self*** object and its CompiledBlock.
A MethodContext contains a reference to its operand stack and its local variables array.
A MethodContext can be reentrant to construct coroutine generators,
so it contains a state either *active*, *suspended* (for generators) or *terminated*.

## BlockContext

A BlockContext is just like a MethodContext, but it also has a reference to its enclosing MethodContext
or BlockContext.
