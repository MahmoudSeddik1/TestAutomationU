package presskeys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.PressKeysPage;

import static org.testng.Assert.assertEquals;

public class TestKeyPress extends BaseTests {
    @Test
    public void testKeyPress(){
   PressKeysPage PressPage   = homePage.PressKeys();
   PressPage.enterText(Keys.chord(Keys.BACK_SPACE ,"a"));
   assertEquals(PressPage.getResult(),"You entered: A");
    }
}
