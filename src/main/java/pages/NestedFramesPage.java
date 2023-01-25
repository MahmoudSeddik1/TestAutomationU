package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By LeftArea = By.xpath("//frame[@name='frame-left']");
    private By BottomArea = By.xpath("//frame[@name='frame-bottom']");
    private By TopArea = By.xpath("//frame[@name='frame-top']");
    private By body = By.tagName("body");
//    private WebElement LeftAreaElement = driver.findElement(LeftArea);
//    private WebElement BottomAreaElement = driver.findElement(BottomArea);
    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    private void SwitchToTopArea(){
        driver.switchTo().frame("frame-top");//can be used by name or ID
    }
    private void SwitchToLeftArea(){
        driver.switchTo().frame(driver.findElement(LeftArea)); // can be used by xpath
    }
    private void SwitchToBottomArea(){
        driver.switchTo().frame(driver.findElement(BottomArea));
    }
    private void SwitchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public String getLeftText(){
        SwitchToTopArea();
        SwitchToLeftArea();
        String LeftText = driver.findElement(body).getText();
        SwitchToMainArea();
        SwitchToMainArea();
        return LeftText;
    }
    public String getBottomText(){
        SwitchToBottomArea();
        String BottomText = driver.findElement(body).getText();
        SwitchToMainArea();
        return BottomText;
    }

}
