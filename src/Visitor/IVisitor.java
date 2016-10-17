package Visitor;

/**
 * Created on 17.10.2016
 *
 * Interface for visitors
 *
 * @author Les
 * @version 6.8
 */
interface IVisitor {

    void visit(CPU cpu);
    void visit(RAM ram);
    void visit(ROM rom);

}
