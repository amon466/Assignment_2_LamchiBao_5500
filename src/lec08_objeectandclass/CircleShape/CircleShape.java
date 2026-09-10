package lec08_objeectandclass.CircleShape;

public class CircleShape {

    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
