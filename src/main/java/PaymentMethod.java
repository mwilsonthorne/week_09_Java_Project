public class PaymentMethod {

    PaymentMethodType type;
    double balance;

    public PaymentMethod(PaymentMethodType type, double balance){
        this.type = type;
        this.balance = balance;
    }

    public PaymentMethod(PaymentMethodType type){
        this.type = type;
        this.balance = 0;
    }

    //overloading constructors

    public PaymentMethodType getType(){
        return this.type;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deductFromAccount(double transactionAmount){
        this.balance -= transactionAmount;
    }

    public void refundAccount(double transactionAmount){
        this.balance += transactionAmount;
    }







}
