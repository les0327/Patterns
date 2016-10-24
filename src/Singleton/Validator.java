package Singleton;

/**
 * Created on 17.10.2016
 *
 * Class describe abstractions of validator of table queries
 *
 * @author Les
 * @version 9.5
 */
class Validator {

    /**
     * Empty constructor
     */
    Validator(){
        System.out.println("Створено новий екземпляр валідатора");
    }

    /**
     * Check query validity
     */
    void valid(){
        System.out.println("Перевірка на вілідність");
    }
}
