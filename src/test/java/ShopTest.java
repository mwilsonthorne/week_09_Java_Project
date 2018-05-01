import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    Customer customer;
    Perishable perishable;


    @Before
    public void before(){

        perishable = new Perishable(8, "Bread", 1.00, "May 5th 2018");
        customer = new Customer("Tam", 70, 100, perishable);
        shop = new Shop("Harrids Convenience Store", 100, 1000);
        item = new Item(2, "Daily Record", 0.50);
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
        //then carry out the method between the shop and the customer to deduct wallet and increase sales.
        shop.addStock(item);
        customer.takeStockItemFromShop(shop);
        shop.checkOutCustomer(customer);
        //ASSERTS if the actions above have behaved correctly then below is the verification phase.
        assertEquals(1000.50, shop.getSales(), 0.01);
        assertEquals(99.50, customer.getWallet(), 0.01);
    }

    @Test
    public void canGiveARefund(){
        shop.addStock(item);
        customer.takeStockItemFromShop(shop);
        shop.canAcceptItemFromCustomer(customer);
        customer.receiveRefundFromShop(shop);
        assertEquals(100.50, customer.getWallet(), 0.01);
        assertEquals(999.50, shop.getSales(), 0.01);
    }

    @Test
    public void printOutTotalProfit(){
        assertEquals(900, shop.reportTotalSales(), 0.01);

    }


}
