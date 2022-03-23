package curaTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class LogOut {
    @FindBy(xpath = "//a[@id='menu-toggle']")
    private WebElement menu;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement loginOut;

    public LogOut(){ PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);}

    public void logOut() throws InterruptedException {
        menu.click();
        Thread.sleep(1000);
        loginOut.click();

    }


}
