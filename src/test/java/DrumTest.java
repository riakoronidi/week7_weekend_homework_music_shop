import enum_package.InstrumentType;
import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static enum_package.InstrumentType.values;
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
        assertEquals("badum tish", drum.play());
    }

    @Test
    public void testGetType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }

    @Test
    public void testGetConstantValueAsAString() {
        //test return the enum constant as contained in InstrumentType enum class
        assertEquals("PERCUSSION",  InstrumentType.getValue());
    }
}
