import Services.HotFood;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer2;
    Item item;
    Shop shop;
    Perishable perishable;
    HotFood hotFood;


    @Before
    public void Before(){
        hotFood = new HotFood("Hello"); // need to ensure an object of hotFood is put before customer to
        //ensure this is taken into account when creating the customer object(instance) below.
        perishable = new Perishable(7, "Chocolate Brownie", 0.30, "14th May 2018");
        customer = new Customer("Jack", 72, 50, hotFood);
        customer2 = new Customer("Victor", 74, 60, perishable);
        item = new Item(1, "The Sun", 0.70);
        shop = new Shop("Harrids Convenience Store", 200, 1500);
        shop.addStock(item); //for testing we need to add an item object to the item ArrayList in the shop.


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
    public void hasBasket(){
        assertEquals(0, customer.getBasket().size());
    }

    @Test
    public void hasPaymentTypesInWallet(){
        assertEquals(0, customer.getPaymentType());
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

    @Test
    public void canHaveASample(){
//        HotFood hotFood = new HotFood("12pm");
//        customer = new Customer("Jack", 72, 50, hotFood);
        assertEquals("Hello Jack", customer.sample());
    }

    @Test
    public void eatASample(){
        Perishable trySample = (Perishable) customer2.getTrySample();
        //
        assertEquals(0.30, trySample.getPrice(), 0.1);
    }

    @Test
    public void deductMoneyFromCustomerWallet(){
        customer.takeMoneyFromWallet(37.00);
        assertEquals(13.00, customer.getWallet(), 0.01);
    }





    }






