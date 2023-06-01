package com.example.asanbekov_hw_7_1.domain.usecase

import com.example.asanbekov_hw_7_1.domain.repository.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository : NoteRepository
) {
    fun getAllNotes () = noteRepository.getAllNotes()
}