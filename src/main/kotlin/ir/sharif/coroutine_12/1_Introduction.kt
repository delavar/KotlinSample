package ir.sharif.coroutine_12

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Coroutines allow you to write asynchronous, non-blocking code in a sequential manner.

fun main() = runBlocking {
    launch {
        delay(1000L)  // Simulate some work
        println("Hello from Coroutine!")
    }
    println("Hello from Main Thread!")
}