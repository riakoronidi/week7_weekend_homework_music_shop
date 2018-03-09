package instruments;

import items.Instrument;

public class Violin extends Instrument {
    public Violin(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type, material, colour);
    }

    @Override
    public String play() {
        return "Violin sound";
    }
}
