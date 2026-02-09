package L;

public class Main {
    static void main() {

        Damage receivesDamage = new ReceivesDamage();
        Damage noReceivesDamage = new NoReceivesDamage();

        Character warrior = new Warrior("Arturo", receivesDamage);
        Character ghost = new Ghost("Casper", noReceivesDamage);

        warrior.attack();
        warrior.takeDamage(40);

        ghost.attack();
        ghost.takeDamage(20);

    }
}
