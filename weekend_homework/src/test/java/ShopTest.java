import MusicShop.Shop;
import Stock.Instrument;
import Stock.InstrumentType;
import Stock.Material;
import Stock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop("TC Gakki", 1000.00);
        piano = new Piano("Black",200.00,400.00, Material.PLASTIC, InstrumentType.STRING, "Old MacDonald had a farm, E I E I O!", 88, 236);

    }

    @Test
    public void shopHasName() {
        assertEquals("TC Gakki", shop.getName());
    }

    @Test
    public void shopHasTill() {
        assertEquals(1000.00, shop.getTill(),0.01);
    }




}
