package Singleton;

/**
 * Created on 17.10.2016
 *
 * Main class
 *
 * @author Les
 * @version 9.5
 */
public class Main {

    public static void main(String[] args) {
        DataBaseScheme dbs = DataBaseScheme.getInstance();

        RelationalTable[] tables = new RelationalTable[1];

        tables[0] = new RelationalTable();

        String[] columns = new String[3];
        String[][] data = new String[3][3];
        Validator validator = new Validator();

        tables[0].setColumns(columns);
        tables[0].setData(data);
        tables[0].setValidator(validator);

        dbs.setTables(tables);

        dbs.show();
    }
}
