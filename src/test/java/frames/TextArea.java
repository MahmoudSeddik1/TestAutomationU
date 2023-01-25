package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygPage;

import static org.testng.Assert.assertEquals;

public class TextArea extends BaseTests {
    @Test
    public void testTextArea(){
        String text1 = "Hello ";
        String text2 = "World!";
        WysiwygPage wysiwygPage = homePage.clickWysiwygPage();
        wysiwygPage.ClearTextArea();
        wysiwygPage.EnterText(text1);
        wysiwygPage.clickIndentButton();
        wysiwygPage.EnterText(text2);
        assertEquals(wysiwygPage.enteredText(),text1+text2,"Entered text is incorrect!");
    }


}
