import java.util.ArrayList;

public class Wallet {
    private ArrayList<PaymentMethod> paymentMethods;
    private PaymentMethodType defaultPaymentMethodType; //Card, Cash, Debit


    public Wallet(ArrayList<PaymentMethod> paymentMethods, PaymentMethodType defaultPaymentMethodType) {
        this.paymentMethods = paymentMethods;
        this.defaultPaymentMethodType = defaultPaymentMethodType;

    }

    public void addFunds(double funds) {
        getDefaultPaymentMethod().refundAccount(funds);
    }


    public void subtractFunds(double funds){
        getDefaultPaymentMethod().deductFromAccount(funds);
    }

    private PaymentMethod getDefaultPaymentMethod(){
        PaymentMethod defaultPaymentMethod = null;

        for(PaymentMethod method : paymentMethods ) { //loop through all the payment types.
            if(method.getType() == defaultPaymentMethodType){ //if the default Payment Type is there then see next line
                defaultPaymentMethod = method; //put method in result.
            }
        }

        if (defaultPaymentMethod.equals(null)){ //if you didn't find default, use the first one
            defaultPaymentMethod = paymentMethods.get(0); //give me the first item from the ArrayList.
        }

        return defaultPaymentMethod;
    }

//    public boolean canSubtractFunds(double fundsToWithdraw){
//        boolean doIHaveEnough = (getFundsOfDefaultPaymentMethod() > fundsToWithdraw);
//        return doIHaveEnough;
//    }

    public double getFundsOfDefaultPaymentMethod(){
        double balance = 0;

        for(PaymentMethod method : paymentMethods ) {
            if(method.getType() == defaultPaymentMethodType){
                balance = method.getBalance();
            }
        }

        return balance;
    }


}
