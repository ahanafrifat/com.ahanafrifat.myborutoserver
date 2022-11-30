package com.ahanafrifat.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {

    get("/") {
        call.respond(
            message = "Welcome to Buruto API",
            status = HttpStatusCode.OK
        )
    }

}