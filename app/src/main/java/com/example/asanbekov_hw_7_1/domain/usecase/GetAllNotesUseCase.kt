package com.example.asanbekov_hw_7_1.domain.usecase

import com.example.asanbekov_hw_7_1.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor (
    private val noteRepository : NoteRepository
) {
    fun getAllNotes () = noteRepository.getAllNotes()
}