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
        this.basket = new ArrayList<Item>(); //ArrayList is empty so don't have to pass in as an argument.
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


}
