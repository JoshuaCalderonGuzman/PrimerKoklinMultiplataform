package com.example.primerkoklinmultiplataform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform