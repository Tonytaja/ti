package mouseAutomation;

import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static framework.DriverProvider.prepareDriver;

public class JavaAlerts {

    public void simpleAlert() throws InterruptedException {
        WebElement alertOne = prepareDriver().findElement(By.xpath("//button[@id='s_alert1']"));
        Actions builder = new Actions(prepareDriver());
        Thread.sleep(1000);
        builder.click(alertOne).perform();
        Thread.sleep(1000);
        Alert a = prepareDriver().switchTo().alert();
        System.out.println(a.getText());
        a.accept();
    }
    public void confirmationBox() throws InterruptedException {
        WebElement alertTwo = prepareDriver().findElement(By.xpath("//button[@id='c_alert2']"));
        Actions builder = new Actions(prepareDriver());
        Thread.sleep(1000);
        builder.click(alertTwo).perform();
        Thread.sleep(1000);
        Alert b = prepareDriver().switchTo().alert();
        System.out.println(b.getText());
        b.accept();
    }
    public void promptBox() throws InterruptedException {
        WebElement alertThree = prepareDriver().findElement(By.xpath("//button[@id='p_alert3']"));
        Actions builder = new Actions(prepareDriver());
        Thread.sleep(1000);
        builder.click(alertThree).perform();
        Thread.sleep(1000);
        Alert c = prepareDriver().switchTo().alert();
        System.out.println(c.getText());
        c.sendKeys("Katowice");
        Thread.sleep(1000);
        c.accept();

    }
}
