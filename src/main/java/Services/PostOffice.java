package Services;

public class PostOffice {

    private String openingHours;

    public PostOffice(String openingHours){
        this.openingHours = openingHours;
    }


    public String getOpeningHours(){
        return this.openingHours;
    }

    public String openingHours(String timeFrame){
        return "Last post at: " + timeFrame + "today";
    }
}
