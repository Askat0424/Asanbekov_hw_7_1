package com.example.asanbekov_hw_7_1.domain.repository

import com.example.asanbekov_hw_7_1.domain.model.Note

interface NoteRepository {

    fun getAllNotes() : List<Note>

    fun createNote(note: Note)

    fun updateNote(note: Note)

    fun deleteNote(note: Note)
}