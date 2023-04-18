package com.example.jetpackquizapp.repository

import android.util.Log
import com.example.jetpackquizapp.data.DataOrException
import com.example.jetpackquizapp.model.QuestionItem
import com.example.jetpackquizapp.network.QuestionApi
import javax.inject.Inject

/**
 * Created by Deepak Rattan on 14/04/23
 */
class QuestionRepository @Inject constructor(
    private val api: QuestionApi
) {
    companion object {
        const val TAG = "QuestionRepository"
    }

    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>, Boolean, java.lang.Exception>()

    // Get all questions
    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (e: Exception) {
            dataOrException.exception = e
            Log.d(
                TAG,
                "getAllQuestions Exception : ${dataOrException.exception?.localizedMessage} "
            )
        }
        return dataOrException
    }


}