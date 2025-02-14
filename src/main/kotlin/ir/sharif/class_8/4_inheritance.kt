package ir.sharif.class_8

interface IShape {
    val vertexCount: Int
    fun draw()
}

class Polygon : IShape {
    override var vertexCount: Int = 0  // Can be set to any number later
    override fun draw() {
        println("Drawing a polygon")
    }
}

// Always has 4 vertices
open class Rectangle(override val vertexCount: Int = 4) : IShape {
    open val filledColor : String = "transparent"
    override fun draw() {
        println("Drawing a rectangle")
    }
}


class FilledRectangle : Rectangle() {
    override val filledColor: String = "black"
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }
}
