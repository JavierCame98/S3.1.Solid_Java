package L;

public class NoReceivesDamage implements Damage{

    @Override
    public void takeDamage(int points) {
        System.out.println("This character can't receive damage");
    }
}
