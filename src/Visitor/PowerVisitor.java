package Visitor;

/**
 * Created on 17.10.2016
 *
 * Class describe visitor which determine computer power
 *
 * @author Les
 * @version 6.8
 */
class PowerVisitor implements IVisitor{

    @Override
    public void visit(CPU cpu) {
        System.out.println("CPU power - " + cpu.getPower());
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("RAM power - " + ram.getPower());
    }

    @Override
    public void visit(ROM rom) {
        System.out.println("ROM power - " + rom.getPower());
    }
}
