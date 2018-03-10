package instruments;

import enum_package.InstrumentType;
import items.Instrument;

public class Drum extends Instrument {

    Drum drum;
    InstrumentType instrumentType;

    public Drum(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType) {
        super(wholesalePrice, retailPrice, material, colour);
        this.drum = drum;
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    @Override
    public String play() {
        return "badum tish";
    }
}
