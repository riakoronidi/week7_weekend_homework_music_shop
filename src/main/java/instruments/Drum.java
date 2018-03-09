package instruments;

import items.Instrument;

public class Drum extends Instrument {

    public Drum(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return null;
    }
}
