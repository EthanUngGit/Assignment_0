class Circle(name: String) : Shape(name) {
    // initialize variables
    private var radius: Double = 0.0

    // set values to variable radius
    fun setDimensions(radius: Double) {
        this.radius = radius
    }

    // prints radius
    override fun printDimensions(): String {
        return "Radius: $radius"
    }

    // returns area
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}