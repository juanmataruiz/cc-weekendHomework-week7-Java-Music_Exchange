import Stock.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Tear drop wood tip for rich cymbal sounds", 5.00, 9.00, 40.60);
    }

    @Test
    public void hasDescription() {
        assertEquals("Tear drop wood tip for rich cymbal sounds", drumStick.getDescription());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(5.00, drumStick.getBoughtPrice(),0.01);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(9.00, drumStick.getSoldPrice(),0.01);
    }

    @Test
    public void drumstickHasLength() {
        assertEquals(40.60, drumStick.getDrumstickLength(),0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(4.00, drumStick.getMarkUp(), 0.01);
    }


}
