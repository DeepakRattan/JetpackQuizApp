package com.example.jetpackquizapp.model

/**
 * Created by Deepak Rattan on 14/04/23
 */
data class QuestionItem(
    val answer: String,
    val category: String,
    val choices: List<String>,
    val question: String
)
