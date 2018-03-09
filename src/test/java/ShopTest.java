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

    Item item;
    Shop shop;
    DrumStick drumStick;
    ArrayList<Item> stock;


    @Before
    public void setUp() throws Exception {
        shop = new Shop(item, drumStick,"Guitar Guitar");
        item = new Drum(1000.00, 3000.00, "Metal", "silver", InstrumentType.PERCUSSION);
    }

    @Test
    public void testAddItem() {
        shop.addItem(item);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void testRemoveItem() {
        shop.addItem(item);
        shop.removeItem();
        assertEquals(0, shop.getStockSize());
    }
}
