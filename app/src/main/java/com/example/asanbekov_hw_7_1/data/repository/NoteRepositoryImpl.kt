package com.example.asanbekov_hw_7_1.data.repository

import com.example.asanbekov_hw_7_1.data.local.NoteDao
import com.example.asanbekov_hw_7_1.data.mappers.toEntity
import com.example.asanbekov_hw_7_1.data.mappers.toNote
import com.example.asanbekov_hw_7_1.domain.model.Note
import com.example.asanbekov_hw_7_1.domain.repository.NoteRepository
import com.example.asanbekov_hw_7_1.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow

class NoteRepositoryImpl (
    private val noteDao: NoteDao
        ): NoteRepository {
    override fun getAllNotes(): Flow<Resource<List<Note>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = noteDao.getAllNotes().map { it.toNote() }
                emit(Resource.Success(data))
            } catch (e: Exception) {
                emit(Resource.Error(e.localizedMessage ?: ""))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun createNote(note: Note) {
         noteDao.createNote(note.toEntity())
    }

    override fun updateNote(note: Note) {
   noteDao.updateNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }
}