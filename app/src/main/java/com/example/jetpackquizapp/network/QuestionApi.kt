package com.example.jetpackquizapp.network

import com.example.jetpackquizapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

/**
 * Created by Deepak Rattan on 14/04/23
 */

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}