package ir.sharif.function_7

private fun uppercaseString(text: String): String {
    return text.uppercase()
}
fun main() {
    println(uppercaseString("hello"))
    // HELLO


    println("\n--------lambda--------")
    //val upperCaseString = { text: String -> text.uppercase() }
    val upperCaseString : (String)-> String = { text: String -> text.uppercase() }
    //If you declare a lambda without parameters, then there is no need to use ->. For example:
    println(upperCaseString("hello"))
    // HELLO
}