package ir.sharif.flow_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Create a MutableStateFlow with an initial value of 0
val counterStateFlow = MutableStateFlow(0)

// Expose it as a read-only StateFlow
val counter: StateFlow<Int> = counterStateFlow.asStateFlow()

fun main() = runBlocking {

    // Launch a collector to observe state changes from counter
    launch(Dispatchers.Default) {
        counter.collect { value ->
            println("Collected value: $value")
        }
    }

    // Simulate state updates that modify the StateFlow value
    launch(Dispatchers.Default) {
        repeat(5) { i ->
            delay(500)
            counterStateFlow.value = i + 1
            println("Updated state to: ${i + 1}")
        }
    }

    // Allow time for all updates to complete
    delay(3000)
}