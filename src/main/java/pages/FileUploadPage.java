package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    private By inputfield = By.id("file-upload");
    private By UploadButton = By.id("file-submit");
    private By UploadedFiles = By.id("uploaded-files");
    public void clickButton(){
        driver.findElement(UploadButton).click();
    }
    public void UploadFile(String path){
        driver.findElement(inputfield).sendKeys(path);
        clickButton();
    }
    public void clickUpload(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(inputfield)).click().perform(); //this way i could click on the choose file button
//        driver.findElement(inputfield).click(); //this for some reason didn't work
    }

    public String getFileName(){
       return driver.findElement(UploadedFiles).getText();
    }
}
