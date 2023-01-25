package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicExample2Page {
    private WebDriver driver;
    private By StartButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");
    public DynamicExample2Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStart(){
        List<WebElement> test = driver.findElements(StartButton);
        test.get(0).click();
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }
    public String getLoadedText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
        return driver.findElement(loadedText).getText();

    }

}
