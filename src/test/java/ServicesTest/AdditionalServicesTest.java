package ServicesTest;

import Services.HotFood;
import Services.PostOffice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionalServicesTest {

    HotFood hotFood;
    PostOffice postOffice;

    @Before
    public void before(){
        hotFood = new HotFood("Hot Food served until: 11am");
        postOffice = new PostOffice("Last Post at 4pm today");
    }

    @Test
    public void hasHotFoodLastService(){
        assertEquals("Hot Food served until: 11am", hotFood.getLastService());
    }

    @Test
    public void todayHotFoodLastService(){
        assertEquals("Hot Food served until: 11am", hotFood.lastService("11am"));
    }

    @Test
    public void hasPostOfficeLastService(){
        assertEquals("Last Post at 4pm today", postOffice.getLastService());
    }

    @Test
    public void todayPostOfficeLastService(){
        assertEquals("Last Post at 4pm today", postOffice.lastService("4pm"));
    }



}
