package L;

public class Warrior extends Character{

    public Warrior(String name, Damage damage) {
        super(name, damage);
    }

    @Override
    public void attack(){
        System.out.println("The warrior attacks whit a sword");
    }


}
