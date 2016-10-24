package Command;

/**
 * Created on 24.10.2016
 * Class describe command to press button
 *
 * @author Les
 * @version 7.6
 */
class PressCommand implements ICommand {

    private Menu menu;
    private int index;

    /**
     * Constructor for press command
     * @param index - index of button on menu toolbar.
     * @param menu  - menu toolbar with buttons.
     */
    PressCommand(int index, Menu menu){
        this.index = index;
        this.menu = menu;
    }

    /**
     * Press index button on menu
     */
    @Override
    public void execute() {
        menu.click(index);
    }
}
