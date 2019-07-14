public class ShapeCalculator {
    double squareArea(Square square){
        return square.sideA * square.sideA;
    }

    double circleArea(Circle circle){
        return 3.14 * circle.radius * circle.radius;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.side1 + triangle.side2 + triangle.side3;
    }

    double rectPerimeter (Rectangle rectangle){
        return (rectangle.sideA + rectangle.sideB) * 2;
    }
}
