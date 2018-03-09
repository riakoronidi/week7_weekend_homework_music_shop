package items;

import behaviours.ISell;

public class Item {

    private double wholesalePrice;
    private double retailPrice;
    private String type;


    public Item(double wholesalePrice, double retailPrice, String type) {
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.type = type;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public String getType() {
        return type;
    }
}
