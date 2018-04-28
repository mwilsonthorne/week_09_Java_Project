import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Item> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(Item item){
        this.stock.add(item);
    }

    public Item canRemoveStock() {
        return this.stock.remove(0);
    }



}
