package Command;

/**
 * Created on 24.10.2016
 * Class is button abstraction and command receiver.
 *
 * @author Les
 * @version 7.6
 */
class Button {

    private String name;

    /**
     * Constructor for button
     * @param name - name of button
     */
    Button(String name){
        this.name = name;
    }

    /**
     * Action on press.
     */
    void press(){
        System.out.printf("Button %s pressed.\n", name);
    }
}
