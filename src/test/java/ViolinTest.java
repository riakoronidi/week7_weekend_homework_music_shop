import enum_package.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;
    InstrumentType instrumentType;

    @Before
    public void setUp() throws Exception {
        violin = new Violin(50.00, 120.00, "Wood", "oak dark", InstrumentType.STRING);
    }

    @Test
    public void testCanGetColour() {
        assertEquals("oak dark", violin.getColour());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Violin sound", violin.play());
    }

    @Test
    public void testCanGetType() {
        assertEquals(InstrumentType.STRING, violin.getInstrumentType());
    }
}
