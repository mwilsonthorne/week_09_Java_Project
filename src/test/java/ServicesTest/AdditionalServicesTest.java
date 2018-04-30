package ServicesTest;

import Services.AdditionalServices;
import Services.HotFood;
import Services.PostOffice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionalServicesTest {

    HotFood hotFood;
    PostOffice postOffice;
    AdditionalServices additionalServices;

    @Before
    public void before(){
        hotFood = new HotFood("Hot Food served until: 11am");
        postOffice = new PostOffice("Last Post at 4pm today");
//        additionalServices = new AdditionalServices();
        //We need to have the ability to implement common code with sub classes and not
        // instantiate the AdditionalServices class so we make the AdditionServices Class abstract.

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

//    @Test
//    public void additionalServicesLastService(){
//        assertEquals("4pm closed", additionalServices.lastService("4pm"));
//    }
    //We need to have the ability to implement common code with sub classes and not
    // instantiate the AdditionalServices class

    @Test
    public void postOfficeCanClose(){
        assertEquals("Back in 5 mins", postOffice.notInService("5 mins"));
    }

    @Test
    public void hotFoodCanClose(){
        assertEquals("Breakfast menu finished. Lunch starts at 2pm", hotFood.notInService("2pm"));
    }

}
