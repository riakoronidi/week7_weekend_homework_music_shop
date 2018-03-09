package instruments;

import items.Instrument;

public class Guitar extends Instrument {
    public Guitar(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return null;
    }
}
