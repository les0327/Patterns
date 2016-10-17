package Visitor;

/**
 * Created on 17.10.2016
 *
 * Main class
 *
 * @author Les
 * @version 6.8
 */
public class Main {

    public static void main(String[] args) {
        IComputerComponent[] computer = new IComputerComponent[3];

        computer[0] = new CPU(200);
        computer[1] = new RAM(400);
        computer[2] = new ROM(100);

        IVisitor visitor = new PowerVisitor();

        for (IComputerComponent component : computer)
            component.accept(visitor);
    }
}
