package com.example.jetpackquizapp.data

/**
 * Created by Deepak Rattan on 14/04/23
 */

// This class take care of any exception we are getting from server,loading status etc.
data class DataOrException<T, Boolean, E : Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var e: E? = null
)
