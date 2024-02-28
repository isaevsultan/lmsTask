public class Triangle extends Shape {
    private float side;

    public Triangle(float side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 3*(this.side);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}';
    }
}