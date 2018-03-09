package instruments;

import items.Instrument;

public class Piano extends Instrument {
    public Piano(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return "Piano sound";
    }
}
