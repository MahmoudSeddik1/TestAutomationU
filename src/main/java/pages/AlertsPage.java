package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlert= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirm= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPrompt= By.xpath(".//button[text()='Click for JS Prompt']");
    private By results = By.id("result");
    public AlertsPage (WebDriver driver){this.driver = driver;}
    public void clickAlertTrigger(){
        driver.findElement(triggerAlert).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
        //switchTo() is used because the alert window is an external window and hence normal findElement() cannot be used
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

    }
    public void clickConfirmTrigger(){
        driver.findElement(triggerConfirm).click();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void clickPromptTrigger(){
        driver.findElement(triggerPrompt).click();
    }
    public void alert_sendKeys(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
       return driver.findElement(results).getText();
    }
    public String alert_GetText(){
        return  driver.switchTo().alert().getText();
    }

}
