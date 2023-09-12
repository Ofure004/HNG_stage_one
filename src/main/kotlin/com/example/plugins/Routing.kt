package com.example.plugins

import com.example.model.entity.Details
import com.example.routes.detailsRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        detailsRoute(details = Details())

    }
}
