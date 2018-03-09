package items;


public class Item {

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

}
