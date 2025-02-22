package ir.sharif.coroutine_10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Dispatchers determine the thread or pool of threads that the coroutine will run on.

fun main() = runBlocking {
    // Main dispatcher runs on the main thread (UI thread)
    // This line throws an exception since there is no module that handles Main dispatcher
    launch(Dispatchers.Main) {
        println("Running on Main Thread: ${Thread.currentThread().name}")
    }

    // IO dispatcher runs on a thread pool optimized for IO-bound tasks
    launch(Dispatchers.IO) {
        println("Running on IO Dispatcher: ${Thread.currentThread().name}")
    }

    // Default dispatcher runs on a thread pool optimized for CPU-intensive tasks
    launch(Dispatchers.Default) {
        println("Running on Default Dispatcher: ${Thread.currentThread().name}")
    }

    // Unconfined dispatcher doesn't restrict coroutines to any particular thread
    launch(Dispatchers.Unconfined) {
        println("Running on Unconfined Dispatcher: ${Thread.currentThread().name}")
    }

    println("Complete")
}