import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// suspend functions allow coroutines to be suspended and resumed without blocking a thread.

suspend fun doSomethingSuspended() {
    delay(500L)  // Non-blocking delay
    println("Suspended Function Executed!")
}

fun main() {
    runBlocking {
        launch {
            doSomethingSuspended()  // Calling the suspending function
        }
    }
}