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
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {

    override fun getAllNotes() = flow  {
        emit(Resource.Loading())
        try {
            val data = noteDao.getAllNotes().map { it.toNote() }
            emit(Resource.Success(data))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "unknown error"))
        }
    }.flowOn(Dispatchers.IO)


    override fun createNote(note: Note) = flow{
        emit(Resource.Loading())
        try {
            val data =  noteDao.createNote(note.toEntity())
            emit(Resource.Success(data))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "unknown error"))
        }
    }.flowOn(Dispatchers.IO)


    override fun updateNote(note: Note) = flow{
        emit(Resource.Loading())
        try {
            val data =  noteDao.updateNote(note.toEntity())
            emit(Resource.Success(data))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "unknown error"))
        }
    }.flowOn(Dispatchers.IO)

    override fun deleteNote(note: Note)= flow{
        emit(Resource.Loading())
        try {
            val data =  noteDao.createNote(note.toEntity())
            emit(Resource.Success(data))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "unknown error"))
        }
    }.flowOn(Dispatchers.IO)
}