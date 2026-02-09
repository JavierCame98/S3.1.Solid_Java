package L;

public class ReceivesDamage implements Damage {

    @Override
    public void takeDamage(int points) {
        System.out.println("This character receives damage");
    }
}
