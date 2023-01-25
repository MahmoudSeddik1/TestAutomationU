package HorizontalSlider;


import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class TestSlider extends BaseTests {
    @Test
    public void testSlide(){
        HorizontalSliderPage sliderPage = homePage.clickSlider();
        sliderPage.clickSliderBox();
    }
}
