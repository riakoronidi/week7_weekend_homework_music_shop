import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(500.00, 1200.00, "Percussion Instrument", "Basswood", "black");
    }

    @Test
    public void testCanGetWholesalePrice() {
        assertEquals(1200.00, piano.getRetailPrice(),0.01);
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Piano sound", piano.play());
    }
}
