package ir.sharif.class_8.data_class

data class Person(
    val id: Int,
    val firstName: String,
    val lastName: String = ""
)

fun main() {
    val ali = Person(id = 1, firstName = "ali")
    val mohammad = Person(id = 2, firstName = "mohammad", lastName = "irani")
    println("ali = $ali")
    //ali = Person(id=1, firstName=ali, lastName=)
    println("mohammad = $mohammad")
    //mohammad = Person(id=2, firstName=mohammad, lastName=irani)


    val ali2 = Person(id = 1, firstName = "ali")
    println(ali == ali2)
    //true


   val ali3 = ali.copy(lastName = "dalir")
    println(ali3)
    //Person(id=1, firstName=ali, lastName=dalir)
}