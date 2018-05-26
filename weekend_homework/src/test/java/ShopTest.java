import MusicShop.Shop;
import Stock.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    DrumStick drumStick;
    Accessory accessory;

    @Before
    public void before() {
        shop = new Shop("TC Gakki", 1000.00);
        piano = new Piano("Black",200.00,400.00, Material.PLASTIC, InstrumentType.STRING, "Old MacDonald had a farm, E I E I O!", 88, 236);
        drumStick = new DrumStick("Tear drop wood tip for rich cymbal sounds", 5.00, 9.00, 40.60);

    }

    @Test
    public void shopHasName() {
        assertEquals("TC Gakki", shop.getName());
    }

    @Test
    public void shopHasTill() {
        assertEquals(1000.00, shop.getTill(),0.01);
    }

    @Test
    public void canCountStock() {
        shop.addInstrument(piano);
        shop.addAccessory(drumStick);
        shop.addAccessory(drumStick);
        assertEquals(3, shop.getStock().size());
    }
//
    @Test
    public void canAddInstrumentToStock() {
        shop.addInstrument(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveInstrumentFromStock() {
        shop.addInstrument(piano);
        shop.addInstrument(piano);
        shop.removeInstrument();
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAddAccessoryToStock() {
        shop.addAccessory(drumStick);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveAccessoryFromStock() {
        shop.addAccessory(drumStick);
        shop.addAccessory(drumStick);
        shop.addAccessory(drumStick);
        shop.removeAccessory();
        assertEquals(2, shop.getStock().size());
    }

}
