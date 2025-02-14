package ir.sharif

class User {
    lateinit var name: String

    fun initializeName(userName: String) {
        name = userName
    }

    fun printName() {
        println("User name is: $name")
    }
}

fun main() {
    val user = User()
    user.initializeName("Ali")
    user.printName()
}