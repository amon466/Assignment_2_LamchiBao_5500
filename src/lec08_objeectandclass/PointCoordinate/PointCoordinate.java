package lec08_objeectandclass.PointCoordinate;

public class PointCoordinate {

    private double x;
    private double y;

    public PointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }
}
