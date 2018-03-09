import enum_package.InstrumentType;
import instruments.Trumpet;
import items.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(50.00, 120.00, "Brass", "red", InstrumentType.WIND);
    }

    @Test
    public void testCanGetWholesalePrice() {
        assertEquals(50.00, trumpet.getWholesalePrice(),0.01);
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Trumpet sound", trumpet.play());
    }

    @Test
    public void testCanGetType() {
        assertEquals(InstrumentType.WIND, trumpet.getInstrumentType());
    }
}
