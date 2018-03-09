package accessories;

import items.Item;

public class DrumStick extends Item{

    DrumStick drumStick;
    private String material;
    private double thickness;
    private double length;

    public DrumStick(double wholesalePrice, double retailPrice, String material, double thickness, double length) {
        super(wholesalePrice, retailPrice);
        this.drumStick = drumStick;
        this.material = material;
        this.thickness = thickness;
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public double getThickness() {
        return thickness;
    }

    public double getLength() {
        return length;
    }
}
