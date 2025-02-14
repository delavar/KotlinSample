package ir.sharif.class_8

class Contact(val id: Int, var email: String) {
    init {
        println("init Contact $category")
    }
    val category: String = "cat1"
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println("The email address is: ${contact.email}")
}