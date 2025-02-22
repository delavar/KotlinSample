package ir.sharif.coroutine_10

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// The difference between launch (fire and forget) and async (which returns a result).

private suspend fun calculate(): Int {
    delay(1000L)
    return 42
}

fun main() = runBlocking {
    val job = launch {
        println("Doing some work...")
        delay(1000L)
    }

    val deferred = async {
        calculate()  // Returns a Deferred result
    }

    job.join()
    val result = deferred.await()  // Get the result from the async task
    println("Result from async: $result")
}