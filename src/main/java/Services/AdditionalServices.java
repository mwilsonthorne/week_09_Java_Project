package Services;

public abstract class AdditionalServices {

    public String lastService(String todayTime){
        return todayTime;
    }

    public abstract String notInService(String todayTime);
    //Example of an Abstract method. Abstract methods have no body and must be defined in the child class.
    //Any child class must implement a notInService method which takes a single String parameter and returns a String

}
