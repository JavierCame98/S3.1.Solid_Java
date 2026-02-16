package L;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LiskovSubstitutionPrincipleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testWarriorBehavior() {
        Damage damageBehavior = new ReceivesDamage();
        Character warrior = new Warrior("Arturo", damageBehavior);

        warrior.attack();
        assertTrue(outContent.toString().contains("The warrior attacks whit a sword"));

        outContent.reset();

        warrior.takeDamage(40);
        assertTrue(outContent.toString().contains("This character receives damage"));
    }

    @Test
    void testGhostBehavior() {
        Damage noDamage = new NoReceivesDamage();
        Character ghost = new Ghost("Casper", noDamage);

        ghost.attack();
        assertTrue(outContent.toString().contains("The ghost casts a spell"));

        outContent.reset();

        ghost.takeDamage(20);
        assertTrue(outContent.toString().contains("This character can't receive damage"));
    }

    @Test
    void testLiskovSubstitutionDynamic() {
        Character character = new Warrior("Generic", new ReceivesDamage());

        character.setDamage(new NoReceivesDamage());
        character.takeDamage(10);

        assertTrue(outContent.toString().contains("This character can't receive damage"));
    }
}
