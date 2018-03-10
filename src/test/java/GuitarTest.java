import enum_package.InstrumentType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(20.00, 50.00, "Mahogany", "brown", InstrumentType.STRING, 6);
    }

    @Test
    public void testCanGetMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("neeeow", guitar.play());
    }

    @Test
    public void testCanGetType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
}
