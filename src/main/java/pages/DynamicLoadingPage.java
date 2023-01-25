package pages;

import org.openqa.selenium.*;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By Example1 = By.linkText("Example 1: Element on page that is hidden");
    private By Example2 = By.linkText("Example 2: Element rendered after the fact");
    public DynamicLoadingPage (WebDriver driver){
        this.driver = driver;
    }
    public DynamicExample1Page clickDynamicExample1(){
        driver.findElement(Example1).click();
        return new DynamicExample1Page(driver);
    }
    public DynamicExample2Page clickDynamicExample2(){
        driver.findElement(Example2).click();
        return new DynamicExample2Page(driver);
    }
    public DynamicExample2Page newTabDynamicExample2(){
        /**
         * Was trying to open the hyperlink in a new tab using right click but i couldn't
         *
         */
//        try {
//            Actions action = new Actions(driver);
//            action.moveToElement(driver.findElement(Example2));
//            Thread.sleep(5000);
//            action.contextClick().sendKeys(Keys.ARROW_DOWN, Keys.RETURN).build().perform();
//        }catch (Exception e){
//            System.out.println("FUCK");
//        }
        driver.findElement(Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicExample2Page(driver);
    }
}
