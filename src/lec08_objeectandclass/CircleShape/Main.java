package lec08_objeectandclass.CircleShape;

public class Main {

    public static void main(String[] args) {

        double testRadius = 4.0;

        CircleShape circle = new CircleShape(testRadius);

        System.out.println("Radius: " + testRadius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
