package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class PopUp {

    @FindBy(xpath = "//input[@name='accept']")
    private WebElement acceptButton;


    public PopUp(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void pop(){
        acceptButton.click();
    }
}
