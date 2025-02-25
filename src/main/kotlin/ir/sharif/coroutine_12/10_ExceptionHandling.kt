package ir.sharif.coroutine_12

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// How to handle exceptions in coroutines.

fun main() = runBlocking {
    val job = launch {
        try {
            taskThatThrows()
        } catch (e: Exception) {
            println("Caught an exception: ${e.message}")
        }
    }
    job.join()  // Wait for the coroutine to complete
}

private suspend fun taskThatThrows() {
    delay(500)
    throw Exception("Something went wrong!")
}