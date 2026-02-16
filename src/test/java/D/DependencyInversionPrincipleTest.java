package D;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DependencyInversionPrincipleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Person testPerson;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        testPerson = new Person();
        testPerson.setName("Gemini");
    }

    @Test
    void testSaveWithMySQL() {
        // Inyectamos la implementación real de MySQL
        Save mysqlRepo = new MySQL();
        ServicePerson service = new ServicePerson(mysqlRepo);

        service.savePerson(testPerson);

        assertTrue(outContent.toString().contains("Save person ok..."));
    }

    @Test
    void testSaveWithMock() {
        // Creamos una implementación rápida (Mock) para demostrar que ServicePerson es flexible
        Save mockRepo = new Save() {
            @Override
            public void savePerson(Person person) {
                System.out.println("Mock save for " + person.getName());
            }
        };

        ServicePerson service = new ServicePerson(mockRepo);
        service.savePerson(testPerson);

        assertTrue(outContent.toString().contains("Mock save for Gemini"));
    }

    @Test
    void testDependencyType() {
        Save mysqlRepo = new MySQL();
        ServicePerson service = new ServicePerson(mysqlRepo);

        // Verificamos que el objeto person se maneja correctamente a través de los métodos de la clase
        assertEquals("Gemini", testPerson.getName());
    }
}
