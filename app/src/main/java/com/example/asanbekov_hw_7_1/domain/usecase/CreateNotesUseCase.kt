package com.example.asanbekov_hw_7_1.domain.usecase

import com.example.asanbekov_hw_7_1.domain.model.Note
import com.example.asanbekov_hw_7_1.domain.repository.NoteRepository

class CreateNotesUseCase(
    private val noteRepository: NoteRepository
) {
    fun getCreateNote(note: Note) = noteRepository.createNote(note)
}