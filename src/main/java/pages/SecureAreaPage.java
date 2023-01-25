package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    private By StatusAlert = By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAlertText(){
         return driver.findElement(StatusAlert).getText();
    }

}
