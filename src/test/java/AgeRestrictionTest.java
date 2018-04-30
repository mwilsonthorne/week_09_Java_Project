import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeRestrictionTest {

    AgeRestriction age;

    @Before
    public void before(){
        age = new AgeRestriction(5, "20 Malboro Lights", 8.50, 16);
    }

    @Test
    public void hasMinAge(){
        assertEquals(16, age.getMinAge());
    }
}
