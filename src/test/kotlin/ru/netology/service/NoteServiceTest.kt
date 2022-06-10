package ru.netology.service

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import ru.netology.data.Note

class NoteServiceTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
        NoteService.clear()
    }

    @Test
    fun add() {
        val expectedId = 0
        val note = Note(1, 1, "--")
        val actualId = NoteService.add(note)

        assertEquals(expectedId, actualId)
    }
}