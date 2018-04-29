public class Drink extends Perishable {

    private double litres;

    public Drink(int id, String name, double price, String expiryDate, double litres){
        super(id, name, price, expiryDate);
        this.litres = litres;

    }

    public double getLitres(){
        return this.litres;
    }


}
