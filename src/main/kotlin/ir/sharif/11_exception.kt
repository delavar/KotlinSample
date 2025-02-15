package ir.sharif


//Kotlin treats all exceptions as unchecked by default


fun getIndices(count: Int): List<Int> {
    /*if(count < 0) {
        throw IllegalArgumentException("Count must be non-negative. You set count to $count.")
    }*/
    require(count >= 0) { "Count must be non-negative. You set count to $count." }
    return List(count) { it + 1 }
}

fun main() {
    // This fails with an IllegalArgumentException
    try {
        println(getIndices(-1))
    }catch (e: IllegalArgumentException){
        println("error")
    }

    /*val result = runCatching {
        println(getIndices(-1))
    }
    if(result.isFailure){
        println("error")
    }*/

    // Uncomment the line below to see a working example
    // println(getIndices(3))
    // [1, 2, 3]
}