package instruments;

import enum_package.InstrumentType;
import items.Instrument;

public class Flute extends Instrument {

    Flute flute;
    InstrumentType instrumentType;

    public Flute(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType) {
        super(wholesalePrice, retailPrice, material, colour);
        this.flute = flute;
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    @Override
    public String play() {
        return "tootle-too";
    }
}
