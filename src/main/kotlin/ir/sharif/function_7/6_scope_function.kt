package ir.sharif.function_7

import kotlin.random.Random

fun main() {
    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            println("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()
    println(i)
}