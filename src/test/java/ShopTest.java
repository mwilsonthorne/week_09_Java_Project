import Services.HotFood;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    Customer customer;
    Perishable perishable;
    Customer customer2;
    Wallet wallet;
    ArrayList<Item> items;
    PaymentMethodType type;
    PaymentMethod method;
    ArrayList<PaymentMethod> methods;


    @Before
    public void before(){
        perishable = new Perishable(8, "Bread", 1.00, "May 5th 2018");

        shop = new Shop("Harrids Convenience Store", 100, 1000);
        item = new Item(2, "Daily Record", 0.50);
        items = new ArrayList<Item>();
        items.add(item);

        methods = new ArrayList<PaymentMethod>();
        PaymentMethod pm1 = new PaymentMethod(PaymentMethodType.CREDITCARD, 100);
        PaymentMethod pm2 = new PaymentMethod(PaymentMethodType.CASH, 10);
        methods.add(pm1);
        methods.add(pm2);
        wallet = new Wallet(methods, PaymentMethodType.CASH);

        customer = new Customer("Tam", 70, wallet, perishable);
        customer2 = new Customer("Ned1", 15, wallet, perishable);
    }

    @Test
    public void haveName() {
        assertEquals("Harrids Convenience Store", shop.getName());
    }

    @Test
    public void hasStartingFloat(){
        assertEquals(100, shop.getStartingFloat(), 0.1);
    }

    @Test
    public void haveSales(){
        assertEquals(1000, shop.getSales(), 0.2);
    }

    @Test
    public void stockIsEmptyInShop(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void addStockToTheShop() {
        shop.addStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void removeStockFromShop(){
        shop.addStock(item);
        assertEquals(1, shop.stockCount());
        shop.canRemoveStock();
        assertEquals(0, shop.stockCount());
    }


    @Test
    public void canMakeASale(){
        //ARRANGE carried out in before() eg created shop and customer.

        //ACTIONS we needed to add an item to the shop then have the customer remove an item from the shop
        //then carry out the methods between the shop and the customer to deduct wallet and increase sales.
        shop.addStock(item);
        customer.takeStockItemFromShop(shop);
        shop.checkOutCustomer(customer);
        //ASSERTS if the actions above have behaved correctly then below is the verification phase.
        assertEquals(1000.50, shop.getSales(), 0.01);
        assertEquals(9.5, customer.getWallet().getFundsOfDefaultPaymentMethod(), 0.01);
    }

    @Test
    public void canGiveARefund(){
        shop.addStock(item);
        customer.takeStockItemFromShop(shop);
        shop.canTakeItemFromCustomer(customer);
        customer.receiveRefundFromShop(shop, items);
        assertEquals(10.50, customer.getWallet().getFundsOfDefaultPaymentMethod(), 0.01);
        assertEquals(999.50, shop.getSales(), 0.01);
    }

    @Test
    public void printOutTotalProfit(){
        assertEquals(900, shop.reportTotalSales(), 0.01);

    }

    @Test
    public void checkCustomerID(){
        shop.addStock(item);
        customer2.takeStockItemFromShop(shop);
        shop.checkAgeOfCustomer(customer2);
        assertEquals(0, customer2.basketCount());
    }

    @Test
    public void checkElderlyCustomerID(){
        shop.addStock(item);
        customer.takeStockItemFromShop(shop);
        shop.checkAgeOfCustomer(customer);
        assertEquals(1, customer.basketCount());
    }




}
