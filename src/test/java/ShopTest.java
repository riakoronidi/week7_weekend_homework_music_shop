import accessories.DrumStick;
import items.Item;
import org.junit.Before;
import shop.Shop;

import java.util.ArrayList;

public class ShopTest {

    Item item;
    Shop shop;
    DrumStick drumStick;
    ArrayList<Item> stock;


    @Before
    public void setUp() throws Exception {
        shop = new Shop(item, drumStick,"Guitar Guitar");
    }


}
