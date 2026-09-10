package lec08_objeectandclass.PointCoordinate;

public class Main {

    public static void main(String[] args) {

        PointCoordinate point = new PointCoordinate(3.0, 4.0);

        double distance = point.distanceFromOrigin();
        System.out.println("The distance from the origin is: " + distance);
    }
}
