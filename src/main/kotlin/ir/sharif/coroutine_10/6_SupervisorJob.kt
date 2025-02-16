package ir.sharif.coroutine_10

import kotlinx.coroutines.*

// A SupervisorJob is a special type of Job that allows child coroutines to fail independently without affecting their sibling coroutines.

private fun taskThatThrows() {
    throw Exception("Something went wrong!")
}

fun main() = runBlocking {
    val supervisorJob = SupervisorJob()
    val scope = CoroutineScope(Dispatchers.Default + supervisorJob)

    val job1 = scope.launch {
        try {
            taskThatThrows()  // This will throw an exception
        } catch (e: Exception) {
            println("Caught exception in job1: ${e.message}")
        }
    }

    val job2 = scope.launch {
        delay(500L)
        println("Job 2 completed successfully.")
    }

    job1.join()
    job2.join()
    println("Both jobs completed, supervisor didn't cancel job2.")
}