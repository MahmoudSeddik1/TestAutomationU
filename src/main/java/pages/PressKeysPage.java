package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PressKeysPage {
    private WebDriver driver;
    private By TextField = By.id("target");
    private By result = By.id("result");
    public  PressKeysPage(WebDriver driver){
        this.driver= driver;
    }
    public void enterText(String text){
        driver.findElement(TextField).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
