import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum(1000.00, 3000.00, "Percussion Instrument", "Metal", "silver");
    }

    @Test
    public void testCanGetSound() {
        assertEquals("Drum sound", drum.play());
    }
}
