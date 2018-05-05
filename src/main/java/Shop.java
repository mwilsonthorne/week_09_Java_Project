import java.util.ArrayList;

public class Shop {

    private String name;
    private double startingFloat;
    private double sales;
    private ArrayList<Item> stock;
    private PaymentMethod method;


    public Shop(String name, double startingFloat, double sales){
        this.name = name;
        this.startingFloat = startingFloat; //Gives the shop a starting amount at the start of the day eg 100.
        this.sales = sales;
        this.stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    
    public double getSales(){
        return this.sales;
    }

    public ArrayList<Item> getStock() {
        return stock;
    }

    public double getStartingFloat(){
        return this.startingFloat;
    }


    public void addStock(Item item){
        this.stock.add(item);
    }

    public Item canRemoveStock() {
       return this.stock.remove(0);
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void canTakeItemFromCustomer(Customer customer){
        Item item = customer.canGiveBackItemToShop();
        this.stock.add(item);

    }

    public void checkOutCustomer(Customer customer){
        double total = 0;                                                                                                //We always start with an empty variable as nothing has been put through the till eg 0
        ArrayList<Item> basketToTotal = customer.getBasket();                                                              //
        for(Item item : basketToTotal){                                                                                       //We need to scan each item in the ArrayList(basket)
            total += item.getPrice();                                                                                       //We need to get the total price of each item
        }
        this.sales += total;                                                                                              //So total sales is increased by the total variable
        customer.takeMoneyFromWallet(total);                                                                              //The customers wallet is decreased via the wallet method by the (total).
    }

    public void takeMoneyFromTill(double refund){
        this.sales -= refund;
    }

    public double reportTotalSales(){
        return this.sales -= this.startingFloat;
    }

    public void checkAgeOfCustomer(Customer customer){
        if(customer.getAge() < 18){
            Item item = customer.canGiveBackItemToShop();
            this.stock.add(item);
        }


    }





}
