import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;

    @Before
    public void Before(){
        customer = new Customer("Jack", 72, 50);
        item = new Item(1);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, customer.basketCount()); //if you don't create a Before method then you will get
        //a NullPointerException which means "I am pointing at nothing" so you need to create an object of customer
        //in Before method.
    }

    @Test
    public void addItemToBasket(){
        customer.addItemToBasket(item);
        assertEquals(1, customer.basketCount());
    }

    @Test
    public void emptyBasketAtTill(){
        customer.addItemToBasket(item);
        assertEquals(1, customer.basketCount());
        customer.emptyBasket();
        assertEquals(0, customer.basketCount());
    }





}
