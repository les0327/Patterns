package Composite;

public class SlotMachine implements ISlotMachine{

    private double x;
    private double y;

    /**
     * @return - occupied area of this machine
     */
    public double getArea(){
        return x*y;
    }
}
