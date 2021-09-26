package inhtest.shapes;

public class Tangle extends Rectangle implements Shapable, Comparable<Shapable> {
    public Tangle() {
        super();
    }

    public Tangle(double a) {
        super(a);
    }

    public Tangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double square() {
        return (super.getSideA() * super.getSideB() / 2);
    }

    @Override
    public double getSideA() {
        return super.getSideA();
    }

    @Override
    public Tangle setSideA(double sideA) {
        return (Tangle) super.setSideA(sideA);
    }

    @Override
    public double getSideB() {
        return super.getSideB();
    }

    @Override
    public Tangle setSideB(double sideB) {
        return (Tangle) super.setSideB(sideB);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tangle tangle)) return false;

        if (tangle.getSideA() != getSideA()) return false;
        return tangle.getSideB() == getSideB();
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
        return "Tangle{" + super.getSideA() + ", " + super.getSideB() + '}';
    }

    @Override
    public int compareTo(Shapable other) {
        return Double.compare(this.square(), other.square());
    }
}
