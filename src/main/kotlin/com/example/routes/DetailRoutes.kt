package com.example.routes

import com.example.model.entity.Details
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.detailsRoute(details: Details) {
    route("/api") {
        get {
            details.slackName = call.request.queryParameters["slack_name"] ?: " "
            details.track = call.request.queryParameters["track"] ?: " "
            if (details.slackName.isNullOrBlank()){
                call.respondText ("Slack username cannot be blank", status = HttpStatusCode.BadRequest)
            }
            else if (details.track.isNullOrBlank()){
                call.respondText ("track cannot be blank", status = HttpStatusCode.BadRequest)
            }
            else call.respond(details)
        }
    }
}

