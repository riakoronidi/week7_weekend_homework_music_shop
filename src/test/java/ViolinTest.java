import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() throws Exception {
        violin = new Violin(50.00, 120.00, "String Instrument", "Wood", "oak dark");
    }

    @Test
    public void testCanGetColour() {
        assertEquals("oak dark", violin.getColour());
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Violin sound", violin.play());
    }
}
