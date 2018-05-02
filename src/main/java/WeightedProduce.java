public class WeightedProduce extends Perishable {

        private String quantity;

        public WeightedProduce(int id, String name, double price, String expiryDate, String quantity){
            super(id, name, price, expiryDate);
            this.quantity = quantity;

        }

        public String getQuantity(){
            return this.quantity;
        }





    }

