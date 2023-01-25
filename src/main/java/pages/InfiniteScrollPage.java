package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By Paragraph = By.className("jscroll-added");
    int index;
    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }
    public void ScrollToParagraph(int index){
        this.index = index;
        var JsExecuter = (JavascriptExecutor)driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        while (getParagraphsExisting()<index){
            JsExecuter.executeScript(script);

        }
    }
    public void SelectParagraph(){
//        this.index = index;
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElements(Paragraph).get(index - 1)).doubleClick().perform();
    }
    private int getParagraphsExisting(){
//        List<WebElement> paragraphsexisting = driver.findElements(Paragraph);
//        return paragraphsexisting.size();
       return driver.findElements(Paragraph).size();
    }
}
