package inhtest.shapes;

public class Rectangle implements Shapable, Comparable<Shapable> {
    private double sideA;
    private double sideB;

    public Rectangle() {
        this.sideA = 1;
        this.sideB = 1;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = a;
    }

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public double square() {
        return (this.sideA * this.sideB);
    }

    @Override
    public int compareTo(Shapable other) {
        return Double.compare(this.square(), other.square());
    }

    public double getSideA() {
        return sideA;
    }

    public Rectangle setSideA(double sideA) {
        this.sideA = sideA;
        return this;
    }

    public double getSideB() {
        return sideB;
    }

    public Rectangle setSideB(double sideB) {
        this.sideB = sideB;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;

        if (rectangle.getSideA() != getSideA()) return false;
        return rectangle.getSideB() == getSideB();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getSideA());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" + sideA + ", " + sideB + '}';
    }


}
