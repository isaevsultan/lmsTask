public class Hexagon extends Shape {
    private float side;

    public Hexagon(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 6*(this.side);
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                '}';
    }
}
