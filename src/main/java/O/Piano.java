package O;

import javax.sound.midi.Instrument;

public class Piano implements InstrumentPlayer {

    @Override
    public void play() {
        System.out.println("🎹 Playing the piano");
    }
}
