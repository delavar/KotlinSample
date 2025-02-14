package ir.sharif.nullsafety_9

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    val nullString: String? = null
    println(lengthString(nullString))
    // null

    //Elvis operator
    println(lengthString(nullString)?:0)
    //0
}