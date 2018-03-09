package instruments;

import items.Instrument;

public class Flute extends Instrument {

    public Flute(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return null;
    }
}
