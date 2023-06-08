package com.example.asanbekov_hw_7_1.domain.repository

import com.example.asanbekov_hw_7_1.domain.model.Note
import com.example.asanbekov_hw_7_1.domain.utils.Resource
import java.util.concurrent.Flow

interface NoteRepository {

    fun getAllNotes() : List<Note>

    fun createNote(note: Note): Flow<Resource<Unit>>

    fun updateNote(note: Note): Flow<Resource<Unit>>

    fun deleteNote(note: Note): Flow<Resource<Unit>>
}