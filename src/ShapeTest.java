public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square (5);
        double squareArea = square.squareArea();
        System.out.println("Pole kwadratu to: " + squareArea);

        Rectangle rectangle = new Rectangle(4,5);
        double rectPerimeter = rectangle.rectPerimeter();
        System.out.println("Obwód prostokąta to: " + rectPerimeter);

        Circle circle = new Circle(7);
        double circleArea = circle.circleArea();
        System.out.println("Pole koła to: " + circleArea);

        Triangle triangle = new Triangle(3,4,5);
        double triPerimeter = triangle.trianglePerimeter();
        System.out.println("Obwód trójkąta to: " + triPerimeter);




    }
}
