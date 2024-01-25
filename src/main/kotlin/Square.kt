class Square(name: String) : Shape(name) {
    // initialize variables
    private var length: Double = 0.0
    private var height: Double = 0.0

    // set values to variables length and height
    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    // prints length and height
    override fun printDimensions(): String {
        return "Length: $length, Height: $height"
    }

    // returns area
    override fun getArea(): Double {
        return length * height
    }
}