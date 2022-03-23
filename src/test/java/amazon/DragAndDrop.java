package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class DragAndDrop {

    public void dragAndDrop(){
        WebElement drag = prepareDriver().findElement(By.xpath("//a[@id='nav-cart']"));
        Actions actionProvider = new Actions(prepareDriver());
        WebElement drop = prepareDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // actionProvider.dragAndDrop(drag,drop).perform();
        actionProvider.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();

    }

}
