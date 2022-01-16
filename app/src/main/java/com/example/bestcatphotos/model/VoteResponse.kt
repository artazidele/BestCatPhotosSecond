package com.example.bestcatphotos.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VoteResponse(
    val id: String,
    val message: String
)
