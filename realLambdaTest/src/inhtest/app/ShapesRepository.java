package inhtest.app;

import inhtest.shapes.Circle;
import inhtest.shapes.Rectangle;
import inhtest.shapes.Shapable;
import inhtest.shapes.Tangle;

import java.util.Arrays;

public class ShapesRepository {
    private final Shapable[] shapes = {new Rectangle(), new Circle(5), new Tangle(3, 2), new Rectangle(5, 1), new Rectangle(3, 1.5), new Rectangle(3, 2),};

    ShapesRepository() {
        Arrays.sort(shapes);
    }

    public Shapable[] getShapes() {
        return shapes;
    }
}
