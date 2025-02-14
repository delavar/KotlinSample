package ir.sharif

fun main() {
    var customers = 10

    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10
    declareVariableWithoutInitial()
    errorInitial()
}

private fun declareVariableWithoutInitial() {
    // Variable declared without initialization
    val d: Int
    // Variable initialized
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "hello"

    // Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello
}

private fun errorInitial() {
    // Variable declared without initialization
    val d: Int
    //d = 1

    // Triggers an error
    println(d)
    // Variable 'd' must be initialized
}

private fun otherTypes() {
    val currentTemp: Float = 24.5f
    val price: Double = 19.99
    val isEnabled: Boolean = true
    val separator: Char = ','
    val message: String = "Hello, world!"
    val d: Long = 100_000_000_000_000
}