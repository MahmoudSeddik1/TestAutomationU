package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertTrue;

public class HoversPage {
    WebDriver driver;


    public HoversPage(WebDriver driver){
        this.driver = driver;
    }
    public void hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(By.className("figure")).get(index-1)).perform();
    }
    public void verifyLink(String linkText){

         assertTrue(driver.findElement(By.linkText(linkText)).isDisplayed());
    }
}
