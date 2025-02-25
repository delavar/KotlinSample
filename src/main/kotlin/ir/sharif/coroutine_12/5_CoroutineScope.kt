package ir.sharif.coroutine_12

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {
    myCoroutineScope.launch {
        println("Task launched in myCoroutineScope")
    }

    println("Main function completed.")
}

private val myCoroutineScope = CoroutineScope(Dispatchers.Default)