package ir.sharif.controlflow_6

fun main() {
    forRanges()
    println("\n---------collections--------")
    forCollections()
}

private fun forRanges(){
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345
    println("\nrange with operator")
    for (number in 1..<5) {
        print(number)
    }
    // 1234

    println("\nrange with downto")
    for (number in 5 downTo 1) {
        print(number)
    }
    // 54321
    println("\nrange with step")
    for (number in 1..6 step 2) {
        print(number)
    }
    // 135

    println("\nrange with char")
    for (number in 'z' downTo 's' step 2) {
        print(number)
    }
    // zxvt
}

private fun forCollections() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!
}