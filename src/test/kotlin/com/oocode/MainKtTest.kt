package com.oocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class MainKtTest {

    @Test
    fun `initiated list is empty`() {
        assertTrue(RecentList().isEmpty())
    }

    @Test
    fun `things can be added to the list`() {
        val thing = "1"
        val recentList = RecentList()
        recentList.addThing(thing)

        assertFalse(recentList.isEmpty())
    }

    @Test
    fun `should be able to retrieve items from the list`() {
        val thing = "1"
        val recentList = RecentList()
        recentList.addThing(thing)

        assertEquals(recentList.retrieve(), "1")
    }
}
