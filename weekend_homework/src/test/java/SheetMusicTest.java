import Stock.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Standard Wirebound Manuscript Paper", 1.50, 4.00, "Variant");
    }

    @Test
    public void hasADescription() {
        assertEquals("Standard Wirebound Manuscript Paper", sheetMusic.getDescription());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(1.50, sheetMusic.getBoughtPrice(),0.01);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(4.00, sheetMusic.getSoldPrice(),0.01);
    }

    @Test
    public void hasStyle() {
        assertEquals("Variant", sheetMusic.getStyle());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(2.50, sheetMusic.getMarkUp(),0.01);
    }
}
