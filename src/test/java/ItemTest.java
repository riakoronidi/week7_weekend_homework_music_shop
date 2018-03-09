import enum_package.InstrumentType;
import instruments.Drum;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setUp() throws Exception {
        item = new Drum(1000.00, 3000.00, "Metal", "silver", InstrumentType.PERCUSSION);
    }

    @Test
    public void testCanGetWholesalePrice() {
        assertEquals(1000.00, item.getWholesalePrice(),0.01);
    }

    @Test
    public void testCanGetRetailPrice() {
        assertEquals(3000.00, item.getRetailPrice(),0.01);
    }

}
