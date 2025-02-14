package ir.sharif.controlflow_6

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)
    // 1

    //There is no ternary operator condition ? then : else
    val a = 1
    val b = 2

    println(if (a > b) a else { b }) // Returns a value: 2
}