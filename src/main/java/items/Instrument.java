package items;

import behaviours.IPlay;

public abstract class Instrument extends Item implements IPlay{
    private String material;
    private String colour;

    public Instrument(double wholesalePrice, double retailPrice, String type, String material, String colour) {
        super(wholesalePrice, retailPrice, type);
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
