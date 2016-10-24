package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 24.10.2016
 * Class is a menu toolbar abstraction.
 * It is Receiver in this realisation of command pattern.
 *
 * @author Les
 * @version 7.6
 */
class Menu {

    private List<Button> buttons;

    /**
     * Empty constructor.
     * Init list f buttons.
     */
    Menu(){
        System.out.println("New menu toolbar created.");
        buttons = new ArrayList<>();
    }

    /**
     * Add new button to menu
     * @param button - button that we want to add to menu
     */
    void add(Button button){
        System.out.println("Button added to menubar.");
        buttons.add(button);
    }

    /**
     * Remove button from menu
     * @param button - button that we want to remove from menu
     */
    void remove(Button button){
        buttons.remove(button);
    }

    /**
     * Click on button with number=index
     * @param index - number of button on menu toolbar
     */
    void click(int index){
        buttons.get(index).press();
    }
}
