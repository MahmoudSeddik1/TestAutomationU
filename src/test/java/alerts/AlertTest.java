package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {
    @Test
    public void testAlert(){
       AlertsPage alertsPage= homePage.clickAlertPage();
       alertsPage.clickAlertTrigger();
       alertsPage.alert_clickToAccept();
      assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }
    @Test
    public void testConfirm(){
        AlertsPage alertsPage = homePage.clickAlertPage();
        alertsPage.clickConfirmTrigger();
        String text = alertsPage.alert_GetText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm");
    }
    @Test
    public void testPrompt(){
        AlertsPage alertsPage = homePage.clickAlertPage();
        alertsPage.clickPromptTrigger();
        String text = "Mahmoud Seddik";
        alertsPage.alert_sendKeys(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text);
    }
}
