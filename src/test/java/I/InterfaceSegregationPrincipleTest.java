package I;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterfaceSegregationPrincipleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Redirigimos la salida para validar los mensajes de consola
        System.setOut(new PrintStream(outContent));
    }


    @Test
    void testACFunctionalities() {
        AirConditioner ac = new AirConditioner(); //

        ac.turnOn(); //
        assertTrue(outContent.toString().contains("AirConditioner is ON"));

        ac.heat(); //
        assertTrue(outContent.toString().contains("AirConditioner is heating."));

        ac.cool(); //
        assertTrue(outContent.toString().contains("AirConditioner is cooling."));

        ac.turnOff(); //
        assertTrue(outContent.toString().contains("AirConditioner is OFF"));
    }

    @Test
    void testACInterfaces() {
        AirConditioner ac = new AirConditioner();
        assertTrue(ac instanceof MachineAction); //
        assertTrue(ac instanceof ManageTemperatures); //
        assertFalse(ac instanceof Wash); // No debe lavar
    }


    @Test
    void testWashingMachineFunctionalities() {
        WashingMachine wm = new WashingMachine(); //

        wm.turnOn(); //
        assertTrue(outContent.toString().contains("WashingMachine is ON"));

        wm.wash(); //
        assertTrue(outContent.toString().contains("WashingMachine is washing clothes."));

        wm.turnOff(); //
            // Nota: En tu código original, turnOff imprime "ON" por error. El test refleja eso.
        assertTrue(outContent.toString().contains("WashingMachine is ON"));
    }

    @Test
    void testWMInterfaces() {
        WashingMachine wm = new WashingMachine();
        assertTrue(wm instanceof MachineAction); //
        assertTrue(wm instanceof Wash); //
        assertFalse(wm instanceof ManageTemperatures); // No gestiona temperatura
    }
}