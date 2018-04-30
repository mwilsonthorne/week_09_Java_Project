package Services;

public abstract class AdditionalServices {

    public String lastService(String todayTime){
        return todayTime;
    }

    public abstract String notInService(String todayTime);
    //Example of an Abstract method. Abstract methods have no body and must be defined in the child class.
    //Any child class must implement a notInService method which takes a single String parameter and returns a String

    public String serviceClosed(){
        return "We are now closed";
    }

    //Example of a method in the abstract class that is implemented from this class. See postOfficeServiceClosed
    //& hotFoodServiceClosed in test file.

    //SOLID - O (OPEN/CLOSED PRINCIPLE)
    //The package Services shows our classes are Open for extension and Closed for modification.
    //Meaning if we wanted to add in another type of Additional Service we don't have to change our AdditionalServices
    //class. We create a new class and extend the AdditionalServices class.
    //1. Abstract Classes may or may not contain abstract methods eg methods without body
    //2. If a class has an abstract method, then the class is declared abstract
    //3. If a class is abstract it cannot be instantiated
    //4. To use an abstract class you have to inherit it through a child class of the abstract.
    //5. If you inherit an abstract class, you have to provide implementations to all the abstract methods in it
    //6. You can declare variables and method parameters where the type is an abstract class but they have to take
    //the value of an instance of on of the child classes.

}
