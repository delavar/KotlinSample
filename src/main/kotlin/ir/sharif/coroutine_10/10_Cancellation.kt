package ir.sharif.coroutine_10

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Coroutines can be canceled, which is useful for stopping long-running operations.

private suspend fun longRunningTask() {
    repeat(10) { i ->
        delay(500L)
        println("Task running: $i")
    }
}

fun main() = runBlocking {
    val job = launch {
        longRunningTask()
    }

    delay(1500L)  // Let the task run for a while
    println("Canceling the task...")
    job.cancel()  // Cancel the coroutine
    job.join()  // Wait for the job to finish
}