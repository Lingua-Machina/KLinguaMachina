# optimizations
## Skip variable fetching when it was stored just before
```
hello := 1;
world := hello + 1337
```
```
0: const_int 1
2: set_local 0
4: get_local 0
6: const_int 1337
8: add
9: set_local 1

variables:
0: hello
1: world
```
Could be optimized to:
```
0: const_int 1
2: dup
3: set_local 0
5: const_int 1337
7: add
8: set_local 1

variables:
0: hello
1: world
```
