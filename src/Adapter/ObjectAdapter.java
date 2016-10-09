package Adapter;

/**
 * This class adapt ILine interface to IPoint
 *
 * @author  - Vova
 * @version - 4.0
 */
public class ObjectAdapter implements ILine {

    private IPoint point1;
    private IPoint point2;

    @Override
    public void draw(double x1, double y1, double x2, double y2) {

        point1.setX((int)x1);
        point1.setY((int)y1);

        point2.setX((int)x2);
        point2.setY((int)y2);

        System.out.printf("Line painted from (%f, %f) to (%f, %f)\n", x1, y1, x2, y2);
    }
}
