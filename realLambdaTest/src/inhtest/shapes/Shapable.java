package inhtest.shapes;

public interface Shapable {
    double square();

    int compareTo(Shapable other);
    @Override
    String toString();
}
