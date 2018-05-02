import Interfaces.IDisplayable;
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

    @Test
    public void canDisplayItemInWindow(){
        IDisplayable window = new Perishable(6,"Roses", 7.00, "2nd May 2018");
        assertEquals("BUY 1 GET 1 FREE", window.displayItemInWindow("BUY 1 GET 1 FREE"));
    }

    //A class implementing an item also takes on the type of that item. When a class implements an interface
    //you can use an instance of that class as an instance of that interface. See test above to show this.

    @Test
    public void canGiveSamples(){
        assertEquals("Have a piece", perishable.sample());
    }

}

