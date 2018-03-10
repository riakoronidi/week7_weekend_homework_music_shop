import accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void setUp() throws Exception {
        musicSheet = new MusicSheet(3, 10, 30);
    }

    @Test
    public void testCanGetNumberOfPages() {
        assertEquals(30, musicSheet.getNumberOfPages());
    }
}
