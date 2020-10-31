package org.linguamachina.klinguamachina.generation.impl

import org.linguamachina.klinguamachina.generation.IndexedSet

class BaseIndexedSet<T>: IndexedSet<T> {
    private val map = mutableMapOf<T, Int>()

    override val size: Int
        get() = map.size

    override val entries: MutableSet<MutableMap.MutableEntry<T, Int>>
        get() = map.entries

    override fun add(value: T): Int {
        return if (map.containsKey(value)) {
            map[value]!!
        } else {
            val index = map.size
            map[value] = index
            index
        }
    }

    override fun getByIndex(index: Int): T {
        return map.entries.find { it.value == index }!!.key
    }

    override fun getIndex(value: T): Int {
        return map[value]!!
    }
}