public class Rectangle extends Shape {
    private float side;

    public Rectangle(float side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*(side);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                '}';
    }
}

