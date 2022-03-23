package mouseAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class Slider {

    public void dot(){

        WebElement colourPicker = prepareDriver().findElement(By.xpath("//div[@class='sp-dragger']"));
        Actions builder = new Actions(prepareDriver());
        builder.clickAndHold(colourPicker).moveByOffset(50,52).release(colourPicker).build().perform();


    }
    public void slider(){
        WebElement colourPicker = prepareDriver().findElement(By.xpath("//div[@class='sp-slider']"));
        Actions builder = new Actions(prepareDriver());
        builder.clickAndHold(colourPicker).moveByOffset(0,152).release(colourPicker).build().perform();
    }
}
