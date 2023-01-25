package pages;

import org.openqa.selenium.*;

public class LargeDomPage {
    private WebDriver driver;
    private By LargeTable  = By.id("large-table");
    public LargeDomPage(WebDriver driver){
        this.driver= driver;
    }
    public void ScrollToTable(){
        var JsExecuter = (JavascriptExecutor)driver;
        String Script = "arguments[0].scrollIntoView();";
        WebElement Table = driver.findElement(LargeTable);
        JsExecuter.executeScript(Script,Table);
    }
}
