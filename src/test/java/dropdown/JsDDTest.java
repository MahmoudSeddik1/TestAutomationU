package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class JsDDTest extends BaseTests {
    @Test
    public void testJSDD(){
        var dropdownpage = homePage.clickDropDown();
        dropdownpage.ChangeDDType();
//        dropdownpage.SelectBothOptions();
        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownpage::selectDropDown);
        List<String> items = dropdownpage.getSelectedItems();
        optionsToSelect.forEach(System.out::println);



        assertEquals(items.size(),optionsToSelect.size(),"Not all options selected!");
        assertTrue(items.containsAll(optionsToSelect),"Error in selection!");

//        assertTrue(items.toString().contains("Option 1"),"Error in selection!");
//        assertTrue(items.toString().contains("Option 2"),"Error in selection!");



    }
}
