import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentMethodTest {

    PaymentMethod paymentMethod;

    @Before
    public void before(){
        paymentMethod = new PaymentMethod(PaymentMethodType.CASH, 50);
    }

    @Test
    public void hasPaymentMethod(){
        assertEquals(PaymentMethodType.CASH, paymentMethod.getType());
    }

    @Test
    public void deductTransactionFromAccount(){
        paymentMethod.deductFromAccount(15.00);
        assertEquals(35.00, paymentMethod.getBalance(), 0.1);
    }

    @Test
    public void refundPreviousTransaction(){
        paymentMethod.refundAccount(20.00);
        assertEquals(70.00, paymentMethod.getBalance(), 0.1);
    }
}
