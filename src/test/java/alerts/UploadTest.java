package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class UploadTest extends BaseTests {
    @Test
    public void testUpload(){
        FileUploadPage fileUploadPage = homePage.clickUploadPage();
        String path  = "C:\\Users\\12378\\Downloads\\MicrosoftTeams-image (2).png";
       fileUploadPage.UploadFile(path);
        assertEquals(fileUploadPage.getFileName(),"MicrosoftTeams-image (2).png");
//        fileUploadPage.clickUpload();
    }
}
