package ir.sharif.function_7

fun printMessageWithPrefix(message: String, prefix: String = "Info"): Unit {
    println("[$prefix] $message")
}

fun main() {
    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello

    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}

fun sum(x: Int, y: Int) = x + y

fun sumWithBraces(x: Int, y: Int): Int {
    return x + y
}