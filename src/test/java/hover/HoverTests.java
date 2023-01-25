package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTests {
    @Test
    public void testHover(){
        HoversPage hoversPage = homePage.clickHovers();
        hoversPage.hoverOverFigure(2);
        hoversPage.verifyLink("View profile");
    }
}
