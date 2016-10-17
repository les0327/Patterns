package Visitor;

/**
 * Created on 17.10.2016
 *
 * ROM abstraction
 *
 * @author Les
 * @version 6.8
 */
class ROM implements IComputerComponent {

    private int power;

    /**
     * Standard constructor
     * @param power - ROM power
     */
    ROM(int power) {
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
