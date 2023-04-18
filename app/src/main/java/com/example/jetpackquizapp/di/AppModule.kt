package com.example.jetpackquizapp.di

import com.example.jetpackquizapp.network.QuestionApi
import com.example.jetpackquizapp.repository.QuestionRepository
import com.example.jetpackquizapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Deepak Rattan on 14/04/23
 */

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }

    @Singleton
    @Provides
    fun provideQuestionRepository(questionApi: QuestionApi) = QuestionRepository(questionApi)
}