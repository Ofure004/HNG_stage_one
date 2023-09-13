package com.example.model.entity

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.util.*

@Serializable
data class Details(
    var slackName : String? = null,
    var currentDay: String = Calendar.getInstance().get(Calendar.DAY_OF_WEEK).toString(),
    var utcTime : String = LocalDateTime.now().toString(),
    var track : String? = null,
    var githubFileUrl : String = "https://bleh",
    var githubRepoUrl : String = "https://github.com/Ofure004/HNG_stage_one",
    var status_code: Int? = 200
)
