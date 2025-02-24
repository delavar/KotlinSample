package ir.sharif.flow_13

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>()

    // Launch first collector.
    launch {
        sharedFlow.collect { value ->
            println("Collector 1 received: $value")
        }
    }

    // Allow the collector to start.
    delay(100)

    // Emit values concurrently.
    launch {
        for (i in 1..5) {
            println("Emitting: $i")
            sharedFlow.emit(i)
            delay(100)
        }
    }

    // Wait for some emissions.
    delay(300)

    // Launch a second collector; it will receive the last 2 emitted values upon subscription.
    launch {
        sharedFlow.collect { value ->
            println("Collector 2 received: $value")
        }
    }

    // Keep the application alive for a while to see all outputs.
    delay(1000)
}