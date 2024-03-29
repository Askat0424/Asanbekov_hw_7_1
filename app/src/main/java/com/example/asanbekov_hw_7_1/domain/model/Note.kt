package com.example.asanbekov_hw_7_1.domain.model

class Note (
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String
){
    companion object{
        const val DEFAULT_ID = 0
    }
}