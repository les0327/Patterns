package Singleton;

/**
 * Created on 17.10.2016
 *
 * Class describe abstraction of  data base scheme
 * Class have only one(single) object
 * It is an example of Singleton pattern
 *

 * @author Les
 * @version 9.5
 */
class DataBaseScheme {

    private RelationalTable[] tables;

    /**
     * Empty constructor
     */
    private DataBaseScheme(){

    }

    /**
     * Show information of all tables
     */
    void show(){
        for (RelationalTable re : tables)
            re.show();
    }

    /**
     * Setter for tables field
     * @param tables - relational tables that forms data base scheme
     */
    void setTables(RelationalTable[] tables) {
        this.tables = tables;
    }

    public static DataBaseScheme getInstance(){
        System.out.println("Передано посилання на эдиний екземпляр схеми бази даних");
        return DataBaseSchemeHolder.dbs;
    }

    /**
     * Inner class that hold single instance of <code>DataBaseScheme</code>
     */
    private static class DataBaseSchemeHolder{
        private static final DataBaseScheme dbs = new DataBaseScheme();
    }

}
