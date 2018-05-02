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

    public void canDeductFromAccount(double transactionAmount){
        this.balance -= transactionAmount;
    }

    public void canRefundAccount(double transactionAmount){
        this.balance += transactionAmount;
    }







}
