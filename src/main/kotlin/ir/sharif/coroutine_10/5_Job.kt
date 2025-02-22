package ir.sharif.coroutine_10

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// A Job represents a coroutine’s lifecycle. It is a handle to manage the execution of a coroutine, which can be cancelled or completed.

fun main() = runBlocking {
    val job: Job = launch {
        repeat(5) { i ->
            delay(500L)
            println("Coroutine is working: $i")
        }
    }

    delay(1200L) // Wait for some time before canceling
    println("Canceling the job...")
    job.cancel()  // Cancel the job
    job.join()    // Wait for the job to finish after cancellation
    println("Job cancelled.")
}

// If one of child coroutines in a job fails, then the parent job will fail all of its child coroutine

//private fun taskThatFails() {
//    throw Exception("Task failed!")
//}
//
//fun main() = runBlocking {
//    // A regular Job (not SupervisorJob) which will cancel all child coroutines if one fails
//    val job: Job = launch {
//        val job1 = launch {
//            try {
//                taskThatFails()  // This will throw an exception
//            } catch (e: Exception) {
//                println("Caught exception in job1: ${e.message}")
//            }
//        }
//
//        val job2 = launch {
//            delay(500L)
//            println("Job 2 completed successfully!")
//        }
//
//        // Wait for all jobs to finish (this is where the parent job waits)
//        job1.join()
//        job2.join()
//    }
//
//    job.join()  // Wait for the parent job to finish
//    println("All jobs completed.")
//}