import Stock.InstrumentType;
import Stock.Material;
import Stock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Black",200.00,400.00, Material.PLASTIC, InstrumentType.STRING, "Old MacDonald had a farm, E I E I O!", 88, 236);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(200.00, piano.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(400.00, piano.getSoldPrice(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.PLASTIC, piano.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, piano.getType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(236, piano.getNumberOfStrings());
    }

    @Test
    public void hasSoundPlayed() {
        assertEquals("Old MacDonald had a farm, E I E I O!", piano.getSoundPlayed());
    }

    @Test
    public void canMakeSound() {
        assertEquals("I make this sound: Old MacDonald had a farm, E I E I O!", piano.play());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(200, piano.getMarkUp(),0.01);
    }


}
