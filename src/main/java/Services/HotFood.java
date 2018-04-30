package Services;

public class HotFood {

    private String openingHours;

    public HotFood(String openingHours){
        this.openingHours = openingHours;
    }

    public String getOpeningHours(){
        return this.openingHours;
    }

    public String OpeningHours(String timeFrame) {
        return "Hot Food served until: " + timeFrame;
    }
}
