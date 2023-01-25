package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicExample2Page;

public class NewTabTest extends BaseTests  {
    @Test
    public void testNewTab(){
        DynamicExample2Page dynamicExample2Page= homePage.clickDynamicLoadingPage().newTabDynamicExample2();
        getWindowManager().SwitchToTab("The Internet");
        dynamicExample2Page.clickStart();
    }
}
