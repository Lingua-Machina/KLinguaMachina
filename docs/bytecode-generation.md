# Byte codes generation

## Assignment
```
var := 1337
```
or
```
var = 1337
```
```
const_int 1337
set_local 0
```

## Message sending
### Built-in messages
#### Unary messages
```
var := !true
```
```
true
not
set_local 0
```

#### Binary messages
```
var := 1300 + 37
```
```
const_int 1300
const_int 37
add
set_local 0
```

### Non built-in
```
myObj a: true b: 1337 c: "Helloworld!"
```
```
get_local 0
true
const_int 1337
const 0
send 1
pop

frame constants:
0 -> "Helloworld!"
1 -> 'a:b:c:

frame variables:
0 -> myObj
```

> If the result of a message sent is not used a **pop** byte code is
> generated so that it disappears from the stack.

### Message chaining
```
myObj a |> b |> c
```
```
get_local 0
send 0
send 1
send 2
pop
```

### Message cascading
```
myObj a | b | c
```
```
get_local 0
dup
dup
send 0
pop
send 1
pop
send 2
pop
```

### Message chaining and cascading
```
myObj a | (b |> c |> d) | e
```
```
get_local 0
dup
dup
send 0
pop
send 1
send 2
send 3
pop
send 4
pop
```

## Arrays
```
var := [1, 2, true, nil]
```
```
const_int 1
const_int 2
true
nil
array 4
set_local 0
```

## Method declaration
```
MyClass >> method {
    "Helloword!" printNewLine
}
```
```
get_local 0
compile 1337

frame variables:
    0 -> MyClass

registered blocks AST node:
    ...
    1337 -> BlockLiteralNode
    ...
```
```
const 0
send 1
pop
nil
non_local_return

frame constants:
    0 -> "Helloworld!"
    1 -> 'printNewLine
```

## Primitive method declaration
```
MyClass :: method = 'primitiveMethod
```
```
get_local 0
bind_primitive 0 1

frame constants:
    0 -> 'method
    1 -> 'primitiveMethod

frame variables:
    0 -> MyClass
```

## Blocks and methods exit
A **non_local_return** must appear at the end of each method, and
a **return** must appear at the end of each block.
If no explicit return has been written then a *nil* value must be
pushed on the stack beforehand.

## Examples
```
{< i != 1337 } whileTrue: {
    i = i + 1;
    "Helloworld!" printNewLine
}
```
```
block 0:
    get_local 0
    const_int 1337
    neq
    return

block 1:
    get_local 0
    const_int 1
    add
    set_local 0
    const 0
    send 1
    pop
    nil
    return

block 2:
    const 0
    const 1
    send 2
    pop
```
