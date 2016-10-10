package Observer;

/**
 * @author Les
 * @version 5.0
 */
public class CountObserver implements IObserver{

    private int countUpdates;

    /**
     * update information in relational table
     */
    @Override
    public void update() {
        countUpdates++;
    }

    /**
     * @return - count of updates of table
     */
    public int getCountUpdates() {
        return countUpdates;
    }
}
