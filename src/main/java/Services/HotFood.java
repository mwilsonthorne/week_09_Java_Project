package Services;

public class HotFood {

    private String lastService;

    public HotFood(String lastService){
        this.lastService = lastService;
    }

    public String getLastService() {
        return lastService;
    }

    public String lastService(String timeFrame) {
        return "Hot Food served until: " + timeFrame;
    }
}
