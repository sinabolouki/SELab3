package main;

public class Square extends Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return  side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
