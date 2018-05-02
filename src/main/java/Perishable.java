import Interfaces.IDisplayable;
import Interfaces.IEatable;

public class Perishable extends Item implements IDisplayable, IEatable {

    private String expireDate;

    public Perishable(int id, String name, double price, String expireDate) {
        super(id, name, price);
        this.expireDate = expireDate;
    }

    public String getExpireDate() {
        return this.expireDate;
    }

    public String advertise(String promote) {
        return "Must go: " + promote;
    }
    //Example above of overriding method advertise from parent class(Item) to suit Perishable class.

    public String displayItemInWindow(String label) {

        return label;
    }


    //Liskov Substitution states if you substitutes a parent class with a child class then it should not break the app.
    //The above example proves this with replacing an instance of Item with an instance of either Perishable or AgeRestriction
    //SOLID = Liskov Substitution.

    public String sample(){
        return "Have a piece";
    }


}