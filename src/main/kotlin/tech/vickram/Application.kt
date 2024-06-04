package tech.vickram

import io.ktor.server.application.*
import tech.vickram.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureSerialization()
    configureSockets()
    configureDatabases()
    configureMonitoring()
    configureRouting()
}
