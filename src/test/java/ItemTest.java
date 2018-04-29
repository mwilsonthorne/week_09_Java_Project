import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;


    @Before
    public void before(){
        item = new Item(3, "Daily Star", 0.75);
    }

    @Test
    public void hasId(){
        assertEquals(3, item.getId());
    }

    @Test
    public void hasBrandName(){
        assertEquals("Daily Star", item.getBrandname());
    }

    @Test
    public void hasPrice(){
        assertEquals(0.75, item.getPrice(), 0.01);
    }

    @Test
    public void changePrice(){
        item.setPrice(0.80);
        assertEquals(0.80, item.getPrice(), 0.01);
    }


}
