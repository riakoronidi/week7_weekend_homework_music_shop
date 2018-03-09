package items;


import behaviours.ISell;

public class Item implements ISell{

    private double wholesalePrice;
    private double retailPrice;


    public Item(double wholesalePrice, double retailPrice) {
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public double calculateMarkup() {
        return retailPrice - wholesalePrice;
    }
}
