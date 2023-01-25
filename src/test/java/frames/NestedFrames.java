package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFrames extends BaseTests {
    @Test
    public void testNestedFrames(){
        NestedFramesPage nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
//        FramesPage framesPage = homePage.clickFramesPage();
//        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftText(),"LEFT","Statement is incorrect!");
        assertEquals(nestedFramesPage.getBottomText(),"BOTTOM","Statement is incorrect!");
    }
}
