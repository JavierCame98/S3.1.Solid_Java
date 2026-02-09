package O;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenClosedPrincipleTest {

    @Test
    void testAllInstrumentsPlay() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        List<InstrumentPlayer> instruments = List.of(
                new Piano(),
                new Guitar(),
                new Drums()
        );

        instruments.forEach(InstrumentPlayer::play);

        String output = outContent.toString();

        assertTrue(output.contains("🎹 Playing the piano"));
        assertTrue(output.contains("🎸 Strumming the guitar"));
        assertTrue(output.contains("🥁 Beating the drums"));

        System.setOut(System.out);
    }

    @Test
    void testInterfaceImplementation() {
        InstrumentPlayer piano = new Piano();
        assertTrue(piano instanceof InstrumentPlayer, "Piano debe ser un InstrumentPlayer");
    }
}
