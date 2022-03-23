package lesson16;

import framework.DriverProvider;
import org.junit.jupiter.api.Test;
import page.TopMenuAmazon;

public class FilterTest {

    @Test
    void filterTest(){

        DriverProvider.prepareDriver().get("https://www.amazon.pl/");
        TopMenuAmazon topMenuAmazon = new TopMenuAmazon();
        topMenuAmazon.clickMenuButton();
        topMenuAmazon.cl();
        //topMenuAmazon.clickBookMenu();
        topMenuAmazon.clickAllBooks();
    }
}
