import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(50.00, 120.00, "Wind Instrument", "Brass", "red");
    }

    @Test
    public void testCanGetWholesalePrice() {
        assertEquals(50.00, trumpet.getWholesalePrice(),0.01);
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Trumpet sound", trumpet.play());
    }
}
