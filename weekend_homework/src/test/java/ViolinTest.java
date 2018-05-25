import Stock.InstrumentType;
import Stock.Material;
import Stock.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;


    @Before
    public void before() {
        violin = new Violin("Brown", 100, 200, Material.PLASTIC, InstrumentType.STRING, 4, "Old Joe Clark");
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(100.00, violin.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(200.00, violin.getSoldPrice(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.PLASTIC, violin.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, violin.getType());
    }


    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void hasSoundPlayed() {
        assertEquals("Old Joe Clark", violin.getSoundPlayed());
    }

    @Test
    public void canMakeSound() {
        assertEquals("I make this sound: Old Joe Clark", violin.play());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(100, violin.getMarkUp(), 0.01);
    }
}
