package com.example.bestcatphotos.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Vote (
    @Json(name = "image_id") val imageId: String, // = "",
    @Json(name = "sub_id") val subId: String, // = "",
    @Json(name = "value") val value: Int // = 0

//    @java.lang.Override
//public String toString() {
//    return "Vote2{" +
//            "title='" + title + '\'' +
//            ", body='" + body + '\'' +
//            ", userId=" + userId +
//            ", id=" + id +
//            '}'
)
