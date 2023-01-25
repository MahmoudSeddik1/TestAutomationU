package javascripts;

import base.BaseTests;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTests {
    @Test
    public void testInfiniteScroll(){
        var infinitescrollpage = homePage.clickInfiniteScrollPage();
        infinitescrollpage.ScrollToParagraph(6);
        infinitescrollpage.SelectParagraph();

    }
}
