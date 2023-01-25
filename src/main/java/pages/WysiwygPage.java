package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygPage {
    private WebDriver driver;
    private String FrameID = "mce_0_ifr";
    private By TextArea = By.id("tinymce");
    private By IndentButton = By.xpath("//button[@title='Increase indent']");
    public WysiwygPage(WebDriver driver){
        this.driver= driver;
    }
    public void ClearTextArea(){
        SwitchToFrame();
        driver.findElement(TextArea).click();
        driver.findElement(TextArea).clear();
        SwitchToMain();
    }
    public void EnterText(String text){
        SwitchToFrame();
        driver.findElement(TextArea).sendKeys(text);
        SwitchToMain();
    }
    public String enteredText(){
        SwitchToFrame();
        String enteredText = driver.findElement(TextArea).getText();
        SwitchToMain();
        return enteredText;
    }
    public void clickIndentButton(){
        driver.findElement(IndentButton).click();
    }
    private void SwitchToFrame(){
        driver.switchTo().frame(FrameID);
    }
    private void SwitchToMain(){
        driver.switchTo().parentFrame();
    }
}
