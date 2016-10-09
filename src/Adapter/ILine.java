package Adapter;

/**
 * Interface for line
 *
 * @author  - Vova
 * @version - 4.0
 */
public interface ILine {

    /**
     * Method draw line from first point to second
     *
     * @param x1 - x coordinate of first point
     * @param y1 - y coordinate of first point
     * @param x2 - x coordinate of second point
     * @param y2 - y coordinate of second point
     */
    void draw(double x1, double y1, double x2, double y2);
}
