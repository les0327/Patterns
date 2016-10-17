package Visitor;

/**
 * Created on 17.10.2016
 *
 * CPU abstraction
 *
 * @author Les
 * @version 6.8
 */
class CPU implements IComputerComponent {

    private int power;

    /**
     * Standard constructor
     * @param power - CPU power
     */
    CPU(int power) {
        this.power = power;
    }

    /**
     * Accept visitor
     *
     * @param visitor - concrete visitor
     */
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return integer value of component's power
     */
    int getPower() {
        return power;
    }
}
