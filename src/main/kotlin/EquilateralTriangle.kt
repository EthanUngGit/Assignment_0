import kotlin.math.sqrt

class EquilateralTriangle(name: String) : Triangle(name) {
    // initialize variables
    private var size123: Double = 0.0

    // set values to side1
    fun setDimensions(size123: Double) {
        this.size123 = size123
    }

    // prints side1, side2, side3
    override fun printDimensions(): String {
        return "Side 1: $size123, Side 2: $size123, Side 3: $size123"
    }

    // returns area
    override fun getArea(): Double {
        return (sqrt(3.0) / 4) * size123 * size123
    }
}

