package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
     WebDriver driver;
     private By dropdown = By.id("dropdown");

     public DropDownPage(WebDriver driver){
         this.driver = driver;
     }
     public void selectDropDown(String option){
         findDropDown(dropdown).selectByVisibleText(option);
     }
     public List<String> getSelectedItems(){
         List<WebElement> selectedElements = findDropDown(dropdown).getAllSelectedOptions();
         return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

     }
     public void ChangeDDType(){
         var JsExecutor = (JavascriptExecutor)driver;
         String script = "arguments[0].setAttribute('multiple', '')";
         JsExecutor.executeScript(script,driver.findElement(dropdown));
     }
     public void SelectBothOptions(){
         findDropDown(dropdown).selectByVisibleText("Option 1");
         new Select(driver.findElement(dropdown)).selectByVisibleText("Option 2");
     }
     private Select findDropDown(By dropdown){
         return new Select(driver.findElement(dropdown));
     }


}
