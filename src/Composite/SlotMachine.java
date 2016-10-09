package Composite;

/**
 * @author Vova
 * @version 3.0
 */
public class SlotMachine implements ISlotMachine{

    private double x;
    private double y;

    /**
     * @return - occupied area of this machine
     */
    public double getArea(){
        return x*y;
    }

    /**
     * @param x - wight of machine
     * @param y - length of machine
     */
    public SlotMachine(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
