package O;

import java.util.List;

public class Main {
    static void main() {

        List<InstrumentPlayer> instruments = List.of(
                new Piano(),
                new Guitar(),
                new Drums()
        );

        instruments.forEach(InstrumentPlayer::play);


    }
}
