package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class NaviTools {
    @FindBy(xpath = "//div[@id='nav-tools']")
    private WebElement toolbar;

    @FindBy(xpath = "//div[@class='nav-line-1-container']")
    private WebElement signIn;

    public NaviTools(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void navi(){
        signIn.click();
    }
}
