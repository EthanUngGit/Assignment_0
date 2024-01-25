fun main() {
    // initializing objects
    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    // user input for square length and height
    println("Enter Length and Height for a Square: ")
    val squareLength = readLine()!!.toDouble()
    val squareHeight = readLine()!!.toDouble()
    // call setDimensions function in square
    square.setDimensions(squareLength, squareHeight)

    // user input for square radius
    println("Enter Radius for a Circle: ")
    val circleRadius = readLine()!!.toDouble()
    // call setDimensions function in circle
    circle.setDimensions(circleRadius)

    // user input for triangle side 1,2,3
    println("Enter Three Sides for a Triangle: ")
    val triangleSide1 = readLine()!!.toDouble()
    val triangleSide2 = readLine()!!.toDouble()
    val triangleSide3 = readLine()!!.toDouble()
    // call setDimensions function in triangle
    triangle.setDimensions(triangleSide1, triangleSide2, triangleSide3)

    // user input for equilateral triangle side 1
    println("Enter side for a Equilateral Triangle: ")
    val equilateralTriangleSide = readLine()!!.toDouble()
    // call setDimensions function in equilateral triangle
    equilateralTriangle.setDimensions(equilateralTriangleSide)

    // formatting the text in terminal
    println("Shape\t\t\t\t\tDimensions\t\t\t\t\t\t\t\t\t\tArea")
    println("-----\t\t\t\t\t-----------\t\t\t\t\t\t\t\t\t\t----")
    // calling printShapeDetails for the various shapes (square, circle, triangle, equilateral triangle)
    printDetails(square)
    printDetails(circle)
    printDetails(triangle)
    printDetails(equilateralTriangle)
}

// prints detail of the shape (square, circle, triangle, equilateral triangle)
fun printDetails(shape: Shape) {
    // printing specifically for format
    when (shape) {
        is Circle -> println("${shape.name}\t\t\t\t\t${shape.printDimensions()}\t\t\t\t\t\t\t\t\t\t${shape.getArea()}")
        is Square -> println("${shape.name}\t\t\t\t\t${shape.printDimensions()}\t\t\t\t\t\t${shape.getArea()}")
        is EquilateralTriangle -> println("${shape.name}\t${shape.printDimensions()}\t\t\t${shape.getArea()}")
        is Triangle -> println("${shape.name}\t\t\t\t${shape.printDimensions()}\t\t\t${shape.getArea()}")
    }
}
