package shop;

import accessories.DrumStick;
import instruments.Drum;
import items.Item;

import java.util.ArrayList;

public class Shop {

    Shop shop;
    Item item;
    DrumStick drumStick;
    private ArrayList<Item> stock;
    private String name;

    public Shop(Item item, DrumStick drumStick, String name) {
        this.shop = shop;
        this.item = item;
        this.drumStick = drumStick;
        this.stock = new ArrayList<>();
        this.name = name;
    }

    public int getStockSize(){
      return stock.size();
    }

    public void addItem (Item item){
        this.stock.add(item);
    }


    public Item removeItem() {
        return stock.remove(0);
    }
}
