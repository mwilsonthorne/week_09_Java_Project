import java.util.ArrayList;

public class Customer {

    String name; //define instance variables as private stops any unwanted access externally.
    private int age;
    private double wallet;
    private ArrayList<Item> basket; //store a collection of Item class

    public Customer(String name, int age, double wallet){ //creating the constructor function with public allows access externally.
        this.name = name;  //instance variables are the state of our object eg name,age and wallet.
        this.age = age;
        this.wallet = wallet;
        this.basket = new ArrayList<>(); //ArrayList is empty so don't have to pass in as an argument.
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double newValue){
        this.wallet = newValue;  //if you want to update the wallet after creating the object use a setter.
    }

//This is the initial single class and an example of Encapsulation

    //The variables of the customer class will be hidden from other future classes,
    // and can be accessed only through the methods of their current class.

    //We achieved Encapsulation by

    //1. Declaring the variables as private
    //2. Create public getter and setter methods to allow the variable values to be viewed/modified.

    //Benefits of Encapsulation

    //1. The fields of a class can be made read-only or write-only.
    //2. A class can have total control over what is stored in its fields.
    //3. The users of a class do not know how the class stores its data.
    // A class can change the data type of a field and users of the class
    // do not need to change any of their code.


    public int basketCount() {
        return this.basket.size();
    }

//    public void addItemToBasket(Item item){
//        this.basket.add(item);
//    }
    //Amended above method to ensure that the shop is taken and adds an item from the shop
    // to the basket to method below.

    public void takeStockItemFromShop(Shop shop) {
        Item item = shop.canRemoveStock();
        this.basket.add(item);
    }

    //Now customer gets the item from the shop and the shop removes and returns the item.
    //The customer now doesn't have access to the shops collection of items directly to amend it.
    //The shop is the only class responsible from removing an item from its ArrayList of Items not the customer.
    //THIS IS SINGLE RESPONSIBILITY from SOLID which states one class or method should do one job.
    //To achieve SINGLE RESPONSIBILITY
    //1. DECOUPLING - classes are not entangled and only depend on each other when necessary.
    //2. ENCAPSULATION - All classes have their variables set to private and only enable editing via public methods.
    //So in above method the customer object is communicating with other objects but only for customers related actions.
    //The shop is responsible for amending its collection of items and not the customer which shows DECOUPLING,
    //separating of Customer and Shop functionality and ENCAPSULATION of class varaibles, shop only can change
    // shops own array of items.

    public void emptyBasket(){
        this.basket.clear();
    }


}
