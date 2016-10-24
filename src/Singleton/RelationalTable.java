package Singleton;

/**
 * Created on 17.10.2016
 *
 * Class describe abstraction of relational table for data base
 *
 * @author Les
 * @version 9.5
 */
class RelationalTable {

    private String[] columns;
    private String[][] data;
    private Validator validator;

    /**
     * Empty constructor
     */
    RelationalTable(){
        System.out.println("Створено новий екземпляр реляційної таблиці");
    }

    /**
     * Some request to table
     */
    void request(){
        validator.valid();
        System.out.println("Запит до таблиці");
    }

    /**
     * Print table
     */
    void show(){
        System.out.println("Вивід таблиці");
    }

    /**
     * Setter for columns field
     * @param columns - array of column's names
     */
    void setColumns(String[] columns) {
        System.out.println("Назви стовпців встановлено");
        this.columns = columns;
    }

    /**
     * Setter for data field
     * @param data - data that contains in table
     */
    void setData(String[][] data) {
        System.out.println("Таблиця заповнена данними");
        this.data = data;
    }


    /**
     * Setter for validator field
     * @param validator - concrete validator for table
     */
    void setValidator(Validator validator){
        System.out.println("Валідатор прив'язаний до таблиці");
        this.validator = validator;
    }
}
