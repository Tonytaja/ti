package page;

import framework.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DarkNaviBarFindBy {
    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUs;

    @FindBy(css = ".login")
    private WebElement signIn;

    public DarkNaviBarFindBy(){
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverProvider.prepareDriver(),10),this);
    }
    public void goToLoginPage(){signIn.click();}

    public LoginPageFindBy goToLoginPageFluent(){
        signIn.click();
        return new LoginPageFindBy();
    }

    public boolean loginButtonIsVisible(){return signIn.isDisplayed();}
}
