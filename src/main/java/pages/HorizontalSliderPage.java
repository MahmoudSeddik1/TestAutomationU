package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
     WebDriver driver;

    By Slider = By.id("range");
    By SliderBox = By.xpath("//input[@type = 'range']");
    public  HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickSliderBox(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//input[@type = 'range']"))).click();
        driver.findElement(By.xpath("//input[@type = 'range']")).click();

    }
}
