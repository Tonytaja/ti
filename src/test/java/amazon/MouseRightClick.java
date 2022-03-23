package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class MouseRightClick {

    public void mouseRC() throws InterruptedException {
        WebElement button = prepareDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Actions actionProvider = new Actions(prepareDriver());
        actionProvider.contextClick(button).perform();
        Thread.sleep(1000);
        actionProvider.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actionProvider.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actionProvider.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actionProvider.sendKeys(Keys.ARROW_DOWN).perform();
        actionProvider.sendKeys(Keys.RETURN).perform();
        System.out.println(prepareDriver().getTitle());
    }
}
