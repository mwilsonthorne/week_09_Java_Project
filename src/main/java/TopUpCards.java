public class TopUpCards extends Item {

    private String serialNumber;

    public TopUpCards(int id, String name, double price, String serialNumber){

        super(id, name, price);
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber(){
        return this.serialNumber;
    }



}
