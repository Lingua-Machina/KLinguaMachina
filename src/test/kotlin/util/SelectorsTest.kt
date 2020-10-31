package util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SelectorsTest {
    @Test
    fun `Blank selector string`() {
        assertFalse("".isMessageSelector)
    }

    @Test
    fun `Forbidden char in selector`() {
        assertFalse("hello@world".isMessageSelector)
    }

    @Test
    fun `Too much colons`() {
        assertFalse("hello::".isMessageSelector)
    }

    @Test
    fun `No trailing colon on arity higher than 1`() {
        assertFalse("hello:world".isMessageSelector)
    }

    @Test
    fun `Good selector of arity = 0`() {
        val s = "hello"
        assertTrue(s.isMessageSelector)
        assertEquals(0, s.messageSelectorArity)
    }

    @Test
    fun `Good selector of arity = 1`() {
        val s = "hello:"
        assertTrue(s.isMessageSelector)
        assertEquals(1, s.messageSelectorArity)
    }

    @Test
    fun `Good selector of arity = 2`() {
        val s = "hello:world:"
        assertTrue(s.isMessageSelector)
        assertEquals(2, s.messageSelectorArity)
    }

    @Test
    fun `Good selector of arity = 3`() {
        val s = "hello:world:wow:"
        assertTrue(s.isMessageSelector)
        assertEquals(3, s.messageSelectorArity)
    }
}
