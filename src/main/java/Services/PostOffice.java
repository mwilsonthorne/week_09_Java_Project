package Services;

public class PostOffice extends AdditionalServices {

    private String lastService;

    public PostOffice(String lastService){
        this.lastService = lastService;
    }

    public String getLastService(){
        return this.lastService;
    }


    public String lastService(String todayTime){
        return "Last Post at " + super.lastService(todayTime) + " today";
    }

    //Example of override method from Parent class AdditionalServices.

    public String notInService(String timeFrame){
        return "Back in " + timeFrame;
    }

    //We need to implement the abstract notInService method in the child class as above.
}
