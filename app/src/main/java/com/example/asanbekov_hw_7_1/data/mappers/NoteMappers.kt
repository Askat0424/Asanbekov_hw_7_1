package com.example.asanbekov_hw_7_1.data.mappers

import com.example.asanbekov_hw_7_1.data.model.NoteEntity
import com.example.asanbekov_hw_7_1.domain.model.Note

fun Note.toEntity() = NoteEntity(id, title, description)

fun NoteEntity.toNote() = Note(id, title, description)