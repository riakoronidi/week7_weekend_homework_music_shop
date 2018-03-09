import accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick(2.00, 15.00, "Hickory", 0.490, 39.37);
    }

    @Test
    public void testCanGetLength() {
        assertEquals(39.37, drumStick.getLength(), 0.01);
    }

    @Test
    public void testCanGetThickness() {
        assertEquals(0.490, drumStick.getThickness(),0.001);
    }

    @Test
    public void testGetMarkupPrice() {
        assertEquals(13, drumStick.sell(),0.01);
    }
}
