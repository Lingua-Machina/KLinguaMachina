package org.linguamachina.klinguamachina.generation

interface IndexedSet<T> {
    fun add(value: T): Int
    fun getIndex(value: T): Int
    fun getByIndex(index: Int): T
    val entries: MutableSet<MutableMap.MutableEntry<T, Int>>
    val size: Int
}
