package com.ahanafrifat.plugins

import com.ahanafrifat.routes.getAllHeroes
import com.ahanafrifat.routes.root
import com.ahanafrifat.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static ("/images"){
            resources("images")
        }
    }
}
