package Services;

public class PostOffice {

    private String lastService;

    public PostOffice(String lastService){
        this.lastService = lastService;
    }

    public String getLastService(){
        return this.lastService;
    }


    public String lastService(String todayTime){
        return "Last Post at " + todayTime + " today";
    }
}
