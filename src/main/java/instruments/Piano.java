package instruments;

import enum_package.InstrumentType;
import items.Instrument;

public class Piano extends Instrument {

    Piano piano;
    InstrumentType instrumentType;
    int numberOfKeys;

    public Piano(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(wholesalePrice, retailPrice, material, colour);
        this.instrumentType = instrumentType;
        this.numberOfKeys = numberOfKeys;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
    @Override
    public String play() {
        return "plink plink";
    }
}
