package ir.sharif.flow_13

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Coroutine flows are a type of cold stream that can asynchronously emit multiple values sequentially.

fun main() = runBlocking {
    launch {
        flow<Int> {
            repeat(5) {
                emit(it)
            }
        }.collect { value ->
            println("flow emitted: $value")
        }
    }

    launch {
        flowOf(1, 2, 3, 4, 5)
            .collect { value ->
                println("flowOf emitted: $value")
            }
    }

    launch {
        listOf(1, 2, 3, 4, 5)
            .asFlow()
            .collect { value ->
                println("asFlow emitted: $value")
            }
    }

    println("Done")
}