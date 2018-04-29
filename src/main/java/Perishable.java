
    public class Perishable extends Item {

        private String expireDate;

        public Perishable(int id, String name, double price, String expireDate){
            super(id, name, price);
            this.expireDate = expireDate;
        }

        public String getExpireDate(){
            return this.expireDate;
        }

        public String advertise(String promote){
            return "Must go: " + promote;
        }

        //Example above of overriding method advertise from parent class(Item) to suit Perishable class.
    }

