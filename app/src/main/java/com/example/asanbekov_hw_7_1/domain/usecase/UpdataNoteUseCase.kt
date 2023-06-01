package com.example.asanbekov_hw_7_1.domain.usecase

import com.example.asanbekov_hw_7_1.domain.model.Note
import com.example.asanbekov_hw_7_1.domain.repository.NoteRepository

class UpdateNotesUseCase(
    private val noteRepository: NoteRepository
) {
    fun updateNote(note: Note) = noteRepository.updateNote(note)
}