package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static framework.DriverProvider.prepareDriver;

public class MouseHover {


    public void mouseHov()  {
        prepareDriver().get("https://www.amazon.pl/");
        WebElement account = prepareDriver().findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Actions actionProvider = new Actions(prepareDriver());
        actionProvider.moveToElement(account).build().perform();
        System.out.println(prepareDriver().getCurrentUrl());
    }
    public void mouseHovSearch()  {
        prepareDriver().get("https://www.amazon.pl/");
        // //input[@id='twotabsearchtextbox'
        WebElement inputButton = prepareDriver().findElement(By.xpath("//div[@class='nav-search-field ']"));
        Actions actionProvider = new Actions(prepareDriver());
        actionProvider.moveToElement(inputButton).build().perform();
        actionProvider.click().sendKeys("Witcher");

        System.out.println(prepareDriver().getTitle());
    }



}
