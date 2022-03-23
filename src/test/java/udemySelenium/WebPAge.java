package udemySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import udemyComponents.WebComponent;

import java.util.List;

public class WebPAge {

    private WebDriver driver;
    protected WebPAge(WebDriver driver){
        this.driver=driver;
    }
    WebElement findElement(By bySelector){
        return driver.findElement(bySelector);
    }
    List<WebElement> findElements(By bySelector){
        return driver.findElements(bySelector);
    }
}
