public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double s1, double s2){
        sideA = s1;
        sideB = s2;
    }

    double rectPerimeter (){
        return (sideA + sideB) * 2;
    }
}
