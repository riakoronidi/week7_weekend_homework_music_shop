import instruments.Flute;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp() throws Exception {
        flute = new Flute(10.00, 30.00, "Wind Instrument", "Wood", "beige");
    }

    @Test
    public void testCanGetType() {
        assertEquals("Wind Instrument", flute.getType());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Flute sound", flute.play());
    }
}
