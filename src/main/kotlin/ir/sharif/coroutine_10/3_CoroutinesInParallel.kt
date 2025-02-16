package ir.sharif.coroutine_10

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Launching multiple coroutines in parallel to run concurrently.

private suspend fun task1() {
    println("Task 1 started!")
    delay(1000L)
    println("Task 1 completed!")
}

private suspend fun task2() {
    println("Task 2 started!")
    delay(1500L)
    println("Task 2 completed!")
}

fun main() = runBlocking {
    val job1 = launch { task1() }
    val job2 = launch { task2() }

    joinAll(job1, job2)  // Wait for both tasks to complete
    println("All tasks completed!")
}