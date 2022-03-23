package mouseAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class ResizableAutomation {


    public void resizable(){
        WebElement source = prepareDriver().findElement(By.xpath("//a[@id='nav-cart']"));
        Actions actionProvider = new Actions(prepareDriver());
        actionProvider.clickAndHold(source).moveByOffset(30,30).build().perform();
    }
}
