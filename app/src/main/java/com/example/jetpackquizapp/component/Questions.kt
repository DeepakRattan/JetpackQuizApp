package com.example.jetpackquizapp.component

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackquizapp.screens.QuestionsViewModel
import com.example.jetpackquizapp.util.AppColor

/**
 * Created by Deepak Rattan on 17/04/23
 */

@Composable
fun Questions(viewModel: QuestionsViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true) {
        Log.d("MainActivity", "Questions :Loading...")
    } else {
        Log.d("MainActivity", "Questions :${questions?.size} ")
    }
}

@Preview
@Composable
fun QuestionDisplay() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(4.dp),
        color = AppColor.mDarkPurple
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

        }

    }
}

@Composable
fun questionTracker(){

}