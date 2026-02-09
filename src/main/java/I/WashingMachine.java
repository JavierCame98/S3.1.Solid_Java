package I;

public class WashingMachine implements MachineAction, Wash {

    @Override
    public void turnOn() {
        System.out.println("WashingMachine is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("WashingMachine is ON");
    }

    @Override
    public void wash() {
        System.out.println("WashingMachine is washing clothes.");
    }
}
