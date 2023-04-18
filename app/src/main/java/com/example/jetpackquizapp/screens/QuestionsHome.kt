package com.example.jetpackquizapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jetpackquizapp.component.Questions

/**
 * Created by Deepak Rattan on 17/04/23
 */

@Composable
fun QuestionHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}
