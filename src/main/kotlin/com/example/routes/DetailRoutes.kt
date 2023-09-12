package com.example.routes

import com.example.model.entity.Details
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*



fun Route.detailsRoute(details: Details){
    route("/getdetails") {
        get{
            details.slackName = call.request.queryParameters["slack_name"] ?: " "
            details.track = call.request.queryParameters["track"] ?: " "

            call.respond(details)
        }
    }
}
