package javascripts;

import base.BaseTests;
import org.testng.annotations.Test;

public class LargeTableTest extends BaseTests  {
    @Test
    public void testLargeTableScroll(){
        homePage.clickLargeDomPage().ScrollToTable();
    }
}
