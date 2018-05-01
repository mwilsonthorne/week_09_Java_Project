public class PaymentMethod {

    PaymentMethodType type;
    double balance;

    public PaymentMethod(PaymentMethodType type){
        this.type = type;
        this.balance = 0;
    }

    public PaymentMethodType getType(){
        return this.type;
    }





}
