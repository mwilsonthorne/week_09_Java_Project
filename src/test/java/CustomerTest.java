import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;
    Shop shop;

    @Before
    public void Before(){
        customer = new Customer("Jack", 72, 50);
        item = new Item(1);
        shop = new Shop("Harrids Convenience Store");
        shop.addStock(item); //for testing we need to add a item object to the item ArrayList in the shop.
    }

    @Test
    public void hasName(){
        assertEquals("Jack", customer.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(72, customer.getAge());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, customer.getWallet(), 0.1);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, customer.basketCount()); //if you don't create a Before method then you will get
        //a NullPointerException which means "I am pointing at nothing" so you need to create an object of customer
        //in Before method.
    }

    @Test
    public void addItemToBasket(){
        customer.takeStockItemFromShop(shop); //AMENDED to take from shop
        assertEquals(1, customer.basketCount()); //Shows ArrayList in Customer is now 1
        assertEquals(0, shop.stockCount()); // Shows ArrayList in Shop is now 0
    }

    @Test
    public void emptyBasketAtTill(){
        customer.takeStockItemFromShop(shop); //AMENDED to take from shop
        assertEquals(1, customer.basketCount());
        customer.emptyBasket();
        assertEquals(0, customer.basketCount());
    }





    }






