package Observer;

import java.util.List;

/**
 * @author Les
 * @version 5.0
 */
public class RelationTable implements IRelationTable {

    private List<IObserver> observers;

    public void doSomething(){
        System.out.println("Do something with table...");
        notifyObserver();
        System.out.println("Observers have been notified.");
    }

    /**
     * Add observer to table
     *
     * @param observer - observer that we want to attach to the table
     */
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    /**
     * Delete observer from table
     *
     * @param observer - observer that we want to delete from the table
     */
    @Override
    public boolean remove(IObserver observer) {
        return observers.remove(observer);
    }

    /**
     * Notify change in table
     */
    @Override
    public void notifyObserver() {
        observers.forEach(IObserver::update);
    }
}
