package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullogin(){
       LoginPage loginPage = homePage.FormAuthenticationClick();
       loginPage.setusername("tomsmith");
       loginPage.setpassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.loginclick();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));


    }
}
