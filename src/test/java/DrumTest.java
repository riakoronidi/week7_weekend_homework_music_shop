import enum_package.InstrumentType;
import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        drum = new Drum(1000.00, 3000.00, "Metal", "silver", InstrumentType.PERCUSSION);
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Drum sound", drum.play());
    }

    @Test
    public void testGetType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }
}
