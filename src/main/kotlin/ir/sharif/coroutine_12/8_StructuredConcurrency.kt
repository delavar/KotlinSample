package ir.sharif.coroutine_12

import kotlinx.coroutines.*

// Coroutines should be structured so that they don’t leak. Using scopes like CoroutineScope and
// SupervisorJob helps manage coroutines properly.

private suspend fun task1() {
    println("Task 1 started!")
    delay(10000L)
    println("Task 1 completed!")
}

private suspend fun task2() {
    println("Task 2 started!")
    delay(5000L)
    println("Task 2 completed!")
}

fun main() = runBlocking {
    val parentJob = SupervisorJob()  // Parent job to manage coroutines
    val scope = CoroutineScope(Dispatchers.Default + parentJob)

    val job1 = scope.launch { task1() }
    val job2 = scope.launch { task2() }

    // Cancel the parent job to cancel all child coroutines
    parentJob.cancel()
    job1.join()  // Wait for job1 to finish
    job2.join()  // Wait for job2 to finish
    println("Parent job cancelled and all tasks completed.")
}