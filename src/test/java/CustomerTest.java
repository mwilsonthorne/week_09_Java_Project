import Services.HotFood;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer2;
    Item item;
    Shop shop;
    Perishable perishable;
    HotFood hotFood;
    PaymentMethod type;
    Wallet wallet;
    ArrayList<PaymentMethod> methods;
    PaymentMethodType paymentMethodType;



    @Before
    public void Before(){
        hotFood = new HotFood("Hello"); // need to ensure an object of hotFood is put before customer to
        //ensure this is taken into account when creating the customer object(instance) below.
        perishable = new Perishable(7, "Chocolate Brownie", 0.30, "14th May 2018");
        type = new PaymentMethod(paymentMethodType, 100);
        methods = new ArrayList<PaymentMethod>();
        PaymentMethod pm1 = new PaymentMethod(PaymentMethodType.CREDITCARD, 100);
        PaymentMethod pm2 = new PaymentMethod(PaymentMethodType.CASH, 10);
        methods.add(pm1);
        methods.add(pm2);
        wallet = new Wallet(methods, PaymentMethodType.CASH);
        customer = new Customer("Jack", 72, wallet, hotFood);
        customer2 = new Customer("Victor", 74, wallet, perishable);
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
        assertEquals(10, customer.getWallet().getFundsOfDefaultPaymentMethod(), 0.1);
    }

    @Test
    public void hasBasket(){
        assertEquals(0, customer.getBasket().size());
    }


    @Test
    public void basketStartsEmpty(){
        assertEquals(0, customer.basketCount()); //if you don't create a Before methods then you will get
        //a NullPointerException which means "I am pointing at nothing" so you need to create an object of customer
        //in Before methods.
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
        assertEquals("Please try these delicious samples", customer.sample());
    }

    @Test
    public void eatASample(){
        Perishable trySample = (Perishable) customer2.getTrySample();
        //
        assertEquals(0.30, trySample.getPrice(), 0.1);
    }

    @Test
    public void deductMoneyFromCustomerWallet(){
        customer.takeMoneyFromWallet(8.00);
        assertEquals(2.00, customer.getWallet().getFundsOfDefaultPaymentMethod(), 0.01);
    }



    }






