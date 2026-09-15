package lec10_AbstractclassandInterface.shape;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double caculateArea() {
        return side * side;
    }

}
