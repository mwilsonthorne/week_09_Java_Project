public class AgeRestriction extends Item {

    private int minAge;

    public AgeRestriction(int id, String name, double price, int minAge){
        super(id, name, price);
        this.minAge = minAge;
    }

    public int getMinAge(){
        return this.minAge;
    }




}
