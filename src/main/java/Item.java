import Interfaces.ISellable;

public class Item implements ISellable{

    private int id;
    private String brandname;
    double price;

    public Item(int id, String brandname, double price) {
        this.id = id;
        this.brandname = brandname;
        this.price = price;
    }

     public int getId(){
        return this.id;
        }


     public String getBrandname(){
        return this.brandname;
     }

     public double getPrice(){
        return this.price;
     }

     public void setPrice(double newPrice){
        this.price = newPrice;
     }

     public String advertise(String promote){
        return "Great Deal: " + promote;
     }




    }



