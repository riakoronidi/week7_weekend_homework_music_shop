import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(20.00, 50.00, "String Instrument", "Mahogany", "brown");
    }

    @Test
    public void testCanGetMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Guitar sound", guitar.play());
    }
}
