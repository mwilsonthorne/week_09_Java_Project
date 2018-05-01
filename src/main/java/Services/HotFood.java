package Services;

import Interfaces.IEatable;

public class HotFood extends AdditionalServices implements IEatable {

    private String lastService;

    public HotFood(String lastService){
        this.lastService = lastService;
    }

    public String getLastService() {
        return lastService;
    }

    public String lastService(String todayTime) {
        return "Hot Food served until: " + super.lastService(todayTime);
    }

    public String notInService(String timeFrame){
        return "Breakfast menu finished. Lunch starts at " + timeFrame;
    }

    public String sample(){
        return "Hello Jack";
    }
}
