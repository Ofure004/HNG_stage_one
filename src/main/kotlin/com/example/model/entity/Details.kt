package com.example.model.entity

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.time.*
import java.time.format.DateTimeFormatter

@Serializable
data class Details(
    var slackName: String? = null,
    var currentDay: DayOfWeek = LocalDate.now().getDayOfWeek(),
    var utcTime: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")),
    var track: String? = null,
    var githubFileUrl: String = "https://github.com/Ofure004/HNG_stage_one/blob/master/src/main/kotlin/com/example/Application.kt",
    var githubRepoUrl: String = "https://github.com/Ofure004/HNG_stage_one",
    var status_code: Int? = 200
)
