package instruments;

import enum_package.InstrumentType;
import items.Instrument;

public class Violin extends Instrument {

    Violin violin;
    InstrumentType instrumentType;

    public Violin(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType) {
        super(wholesalePrice, retailPrice, material, colour);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    @Override
    public String play() {
        return "Violin sound";
    }
}
