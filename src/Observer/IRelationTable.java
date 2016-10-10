package Observer;

/**
 * Interface describe relation table
 *
 * @author Les
 * @version 5.0
 */
public interface IRelationTable {

    /**
     * Add observer to table
     * @param observer - observer that we want to attach to the table
     */
    void addObserver(IObserver observer);


    /**
     * Delete observer from table
     * @param observer - observer that we want to delete from the table
     */
    boolean remove(IObserver observer);

    /**
     * Notify change in table
     */
    void notifyObserver();
}
