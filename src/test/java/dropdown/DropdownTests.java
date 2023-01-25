package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
        public void testDropdown(){
           var dropDownPage= homePage.clickDropDown();
           dropDownPage.selectDropDown("Option 1");
           List<String> Items = dropDownPage.getSelectedItems();
           assertEquals(Items.size(),1,"Incorrect Number!");
           assertTrue(Items.contains("Option 1"),"Option is not selected!");


        }
}
