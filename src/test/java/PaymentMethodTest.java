import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentMethodTest {

    PaymentMethod paymentMethod;

    @Before
    public void before(){
        paymentMethod = new PaymentMethod(PaymentMethodType.CASH);
    }

    @Test
    public void hasPaymentMethod(){
        assertEquals(PaymentMethodType.CASH, paymentMethod.getType());
    }
}
