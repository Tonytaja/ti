package mouseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class MultiKeyOperation {
    public void multiKey(){
        WebElement newPage = prepareDriver().findElement(By.xpath("//img[@alt='WebFX']"));
        Actions builder = new Actions(prepareDriver());
        builder.keyDown(Keys.CONTROL).perform();
        builder.click(newPage);
        builder.keyUp(Keys.CONTROL).perform();
    }
}
