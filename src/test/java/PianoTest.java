import enum_package.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(500.00, 1200.00, "Basswood", "black", InstrumentType.PERCUSSION, 88);
    }

    @Test
    public void testCanGetWholesalePrice() {
        assertEquals(1200.00, piano.getRetailPrice(),0.01);
    }

    @Test
    public void testCanGetSound() {
        assertEquals("plink plink", piano.play());
    }

    @Test
    public void testCanGetType() {
        assertEquals(InstrumentType.PERCUSSION, piano.getInstrumentType());
    }
}
