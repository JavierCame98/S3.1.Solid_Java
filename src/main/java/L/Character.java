package L;

public class Character {

    private String name;
    private Damage damage;

    public Character(String name, Damage damage) {
        this.name = name;
        this.damage = damage;
    }

    public void attack(){
        System.out.println("The character attacks");
    }

    public void takeDamage(int points){
        damage.takeDamage(points);
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }
}
