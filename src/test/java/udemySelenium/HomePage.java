package udemySelenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import udemyComponents.impl.SearchComponent;

public class HomePage extends WebPAge {

    private static final By SEARCH_COMPONENT_SELECTOR= By.cssSelector("[name='q']");

    protected HomePage(WebDriver driver) {
        super(driver);
    }


    public SearchComponent searchComponent(){
        return new SearchComponent(findElement(SEARCH_COMPONENT_SELECTOR));
    }
}
