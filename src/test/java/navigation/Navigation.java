package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class Navigation extends BaseTests  {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoadingPage().clickDynamicExample2();
        getWindowManager().goBackward();
        getWindowManager().goBackward();
        getWindowManager().goForward();
        getWindowManager().Refresh();
        getWindowManager().goTo("https://www.google.com/");
    }
}
