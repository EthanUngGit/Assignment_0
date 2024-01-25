import kotlin.math.sqrt

open class Triangle(name: String) : Shape(name) {
    // initialize variables
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    // set values to side1, side2, side3
    fun setDimensions(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    // prints side1, side2, side3
    override fun printDimensions(): String {
        return "Side 1: $side1, Side 2: $side2, Side 3: $side3"
    }

    // return area
    override fun getArea(): Double {
        val perimeter = (side1 + side2 + side3) / 2
        return sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3))
    }
}