import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before
    public void before(){
        drink = new Drink(4, "Fanta", 2.00, "31st December 2018", 1.0);
    }

    @Test
    public void hasLitres(){
        assertEquals(1.0, drink.getLitres(), 0.1);
    }
}
