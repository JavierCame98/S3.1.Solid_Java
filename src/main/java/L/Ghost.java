package L;

public class Ghost extends Character{

    public Ghost(String name, Damage damage) {
        super(name, damage);
    }

    @Override
    public void attack(){
        System.out.println("The ghost casts a spell");
    }
}
