import enum_package.InstrumentType;
import instruments.Flute;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        flute = new Flute(10.00, 30.00, "Wood", "beige", InstrumentType.WIND);
    }

    @Test
    public void testCanGetType() {
        assertEquals(InstrumentType.WIND, flute.getInstrumentType());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("tootle-too", flute.play());
    }
}
