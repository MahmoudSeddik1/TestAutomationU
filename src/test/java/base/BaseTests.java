package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utilities.MyListenerClass;
import utilities.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver;
    private WebDriver original;
    private MyListenerClass listener;
    protected HomePage homePage;
    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\12378\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        original = new ChromeDriver(getChromeOptions());
        listener = new MyListenerClass();
        driver = new EventFiringDecorator(listener).decorate(original);

        homePage = new HomePage(driver);
//        setCookies();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
//    @AfterClass
//    public void closeAll(){
//        driver.quit();
//    }
@AfterMethod
public void recordFailure(ITestResult result){

    if(ITestResult.FAILURE == result.getStatus())
    {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot,
                    new File("resources/screenshots/" + result.getName() +".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
//        options.setHeadless(true);
        return options;
    }
    public void setCookies(){
        Cookie cookie = new Cookie.Builder("Seddik","1995").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }


}
