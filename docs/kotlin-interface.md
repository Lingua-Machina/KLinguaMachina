# Kotlin Interface

Primitive definition in Kotlin:
```kotlin
@Primitive("myPrimitive")
fun myPrimitiveImpl(context: PrimitiveInvocationContext): LMObject {
    // implementation
}

vm.registerPrimitive(::myPrimitiveImpl)
```

Primitive declaration in Lingua Machina:
```
MyClass::myPrimitive: arg = 'myPrimitive:
```
