package Composite;

import java.util.List;

/**
 * @author Vova
 * @version 3.0
 */
public class GameRoom implements ISlotMachine {

    private List<ISlotMachine> slotMachines;

    /**
     * @param slotMachines - list of slot machines that placed in room
     */
    public GameRoom(List<ISlotMachine> slotMachines) {
        this.slotMachines = slotMachines;
    }

    /**
     * Add to game room new slot machine
     *
     * @param slotMachine
     */
    public void add(ISlotMachine slotMachine){
        this.slotMachines.add(slotMachine);
    }

    /**
     * Remove slot machine from game room
     *
     * @param slotMachine
     */
    public void remove(ISlotMachine slotMachine){
        this.slotMachines.remove(slotMachine);
    }

    /**
     * @param index - number of slot machine in list
     */
    public ISlotMachine getMachine(int index){
        return  this.slotMachines.get(index);
    }


    /**
     * @return - occupied area of all machines from <code>slotMachines</code>
     */
    public double getArea() {
        double result = 0;

        for (ISlotMachine sm : slotMachines)
            result += sm.getArea();

        return result;
    }
}
