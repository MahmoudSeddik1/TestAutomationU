package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage FormAuthenticationClick() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public PressKeysPage PressKeys(){
        clickLink("Key Presses");
        return new PressKeysPage(driver);
    }
//    public HorizontalSliderPage clickSliderLink(){
//        clickLink("Horizontal Slider");
//        return new HorizontalSliderPage(driver);
//    }
    public HorizontalSliderPage clickSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage clickAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public WysiwygPage clickWysiwygPage(){
        clickLink("WYSIWYG Editor");
        return new WysiwygPage(driver);
    }
    public FramesPage clickFramesPage(){
        clickLink("frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingPage (){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeDomPage clickLargeDomPage (){
        clickLink("Large & Deep DOM");
        return new LargeDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollPage (){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }



}


