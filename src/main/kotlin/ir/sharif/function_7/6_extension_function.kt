package ir.sharif.function_7

fun String.printMe() {
    println(this)
}

fun Int.addMe(number: Int) {
    println("\nresult = ${this + number}")
}

fun main() {
   "Hello".printMe()
    200.addMe(400)
}