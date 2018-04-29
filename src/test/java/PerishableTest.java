import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerishableTest {

    Perishable perishable;

    @Before
    public void before(){
        perishable = new Perishable(4, "Apple", 0.10, "May 5th 2018");
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("May 5th 2018", perishable.getExpireDate());
    }

    @Test
    public void canAdvertise(){
        assertEquals("Must go: Half Price", perishable.advertise("Half Price"));
    }
}
