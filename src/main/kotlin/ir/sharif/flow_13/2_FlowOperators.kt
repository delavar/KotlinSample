package ir.sharif.flow_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // Create a flow that emits integers from 1 to 10 every 100ms.
    val numbersFlow = flow {
        for (i in 1..10) {
            delay(100)
            emit(i)
        }
    }

    // Apply various flow operators.
    numbersFlow
        .filter { it % 2 == 0 }          // Keep only even numbers.
        .map { number ->
            val squared = number * number
            // Log transformation.
            println("Mapping $number to squared value $squared")
            squared
        }
        .onEach { processed ->
            // Log each processed value.
            println("Processed number: $processed")
        }
        .takeWhile { it <= 50 }           // Collect numbers until the condition fails.
        .flowOn(Dispatchers.Default)      // Change upstream execution context.
        .collect { value ->
            // Collect and print the final values.
            println("Collected value: $value")
        }
}