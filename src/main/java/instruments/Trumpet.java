package instruments;

import enum_package.InstrumentType;
import items.Instrument;

public class Trumpet extends Instrument {

    Trumpet trumpet;
    InstrumentType instrumentType;
    int numberOfValves;

    public Trumpet(double wholesalePrice, double retailPrice, String material, String colour, InstrumentType instrumentType, int numberOfValves) {
        super(wholesalePrice, retailPrice, material, colour);
        this.instrumentType = instrumentType;
        this.numberOfValves = numberOfValves;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    @Override
    public String play() {
        return "pah-pa-rah";
    }
}
