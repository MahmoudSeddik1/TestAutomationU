package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitExample2 extends BaseTests {
    @Test
    public void testExample2(){
        var example2page = homePage.clickDynamicLoadingPage().clickDynamicExample2();
        example2page.clickStart();
        assertEquals(example2page.getLoadedText(),"Hello World!","Incorrect Message!");
    }
}
