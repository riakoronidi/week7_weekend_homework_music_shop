package instruments;

import enum_package.InstrumentType;
import items.Instrument;


public class Guitar extends Instrument {

    Guitar guitar;
    InstrumentType instrumentType;
    private int numberOfStrings;

    public Guitar(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(wholesalePrice, retailPrice, material, colour);
        this.instrumentType = instrumentType;
        this.numberOfStrings = numberOfStrings;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
    @Override
    public String play() {
        return "neeeow";
    }
}
