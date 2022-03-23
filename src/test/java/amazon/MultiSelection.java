package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class MultiSelection {

    public void multi(){
        WebElement multiCheck = prepareDriver().findElement(By.xpath("//img[@alt='WebFX']"));
        Actions builder = new Actions(prepareDriver());
        builder.click().perform();

    }
}
