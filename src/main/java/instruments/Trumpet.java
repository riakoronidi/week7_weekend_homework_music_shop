package instruments;

import items.Instrument;

public class Trumpet extends Instrument {
    public Trumpet(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return "Trumpet sound";
    }
}
