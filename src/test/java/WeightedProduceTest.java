import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


    public class WeightedProduceTest {

        WeightedProduce weightedProduce;

        @Before
        public void before(){
            weightedProduce = new WeightedProduce(4, "Bananas", 2.00, "31st May 2018", "1kg");
        }

        @Test
        public void hasQuantity(){
            assertEquals("1kg", weightedProduce.getQuantity());
        }
    }

