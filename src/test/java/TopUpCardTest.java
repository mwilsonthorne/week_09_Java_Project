import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopUpCardTest {


    TopUpCards electricityCard;

    @Before
    public void before(){
        electricityCard = new TopUpCards(10, "British Gas Top Up Card", 5.00, "JJ822296A");
    }

    @Test
    public void getSerialNumber(){
        assertEquals("JJ822296A", electricityCard.getSerialNumber());
    }
}



