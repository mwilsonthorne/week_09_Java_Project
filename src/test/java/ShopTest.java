import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;


    @Before
    public void before(){
        shop = new Shop("Harrids Convenience Store");
        item = new Item(2);
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
}
