package com.example.bestcatphotos.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VoteResponse(
    @Json(name = "image_id") val imageId: String, // = "",
    @Json(name = "sub_id") val subId: String, // = "",
    @Json(name = "value") val value: Int
)
