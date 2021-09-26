package inhtest.shapes;

public class Circle implements Shapable, Comparable<Shapable> {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double a) {
        this.radius = a;
    }

    @Override
    public double square() {
        return (this.radius * this.radius * 3.14);
    }

    public double getRadius() {
        return radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;

        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Circle{" + radius + '}';
    }

    @Override
    public int compareTo(Shapable other) {
        return Double.compare(this.square(), other.square());
    }
}
