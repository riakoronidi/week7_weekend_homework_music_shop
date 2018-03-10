import accessories.DrumStick;
import enum_package.InstrumentType;
import instruments.Drum;
import instruments.Piano;
import items.Item;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Item item1;
    Item item2;
    Shop shop;
    DrumStick drumStick;
    ArrayList<Item> stock;
    Piano piano;


    @Before
    public void setUp() throws Exception {
        shop = new Shop(item1, drumStick,"Guitar Guitar");
        item1 = new Drum(1000.00, 3000.00, "Metal", "silver", InstrumentType.PERCUSSION);
        item2 = new Piano(500.00, 1200.00, "Basswood", "black", InstrumentType.PERCUSSION, 88);
    }

    @Test
    public void testAddItem() {
        shop.addItem(item1);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void testRemoveItem() {
        shop.addItem(item1);
        shop.removeItem();
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void testGetProfit() {
        shop.addItem(item1);
        shop.addItem(item1);
        shop.addItem(item2);
        assertEquals(4700.00, shop.getProfit(),0.01);
    }
}
