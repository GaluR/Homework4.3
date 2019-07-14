public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square (5);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3,4,5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Obwód trójkąta to: " + shapeCalculator.trianglePerimeter(triangle));
        System.out.println("Obwód prostokąta to: " + shapeCalculator.rectPerimeter(rectangle));
        System.out.println("Pole kwadratu to: " + shapeCalculator.squareArea(square));
        System.out.println("Pole koła to: " + shapeCalculator.circleArea(circle));

    }
}
