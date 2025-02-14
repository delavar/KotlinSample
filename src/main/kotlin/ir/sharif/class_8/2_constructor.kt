package ir.sharif.class_8

class Person(val id: Int, val firstName: String , val lastName: String) {

    // Secondary constructor
    constructor(id: Int, firstName: String) : this(id = id , firstName = firstName, lastName = "") {
        println("Secondary constructor called firstName= $firstName")
    }

    override fun toString(): String {
        return "Person = $firstName  $lastName"
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Person)?.id == this.id
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}

fun main() {
    val ali = Person(id = 1, firstName = "ali")
    //Secondary constructor called firstName= ali
    val mohammad = Person(id = 2, firstName = "mohammad", lastName = "irani")
    println(ali)
    //Person = ali

    println(mohammad.lastName)
    //irani



    val ali2 = Person(id = 1 , firstName = "ali")
    //Secondary constructor called firstName= ali
    println(ali == ali2)
    //true
}