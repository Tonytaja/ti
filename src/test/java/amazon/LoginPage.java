package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class LoginPage {
    @FindBy(xpath = "//input[@type='email']")
    private WebElement email;

    @FindBy(xpath = "//span[@class='a-button-inner']//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//span[@class='a-button-inner']//input[@id='signInSubmit']")
    private WebElement signInButton;

    public LoginPage(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void login(UserData userData){
        email.sendKeys(userData.getEmail());
        continueButton.click();
        password.sendKeys(userData.getPassword());
        signInButton.click();
    }
    public boolean continueButtonIsVisible(){return continueButton.isDisplayed();}
    public boolean loginButtonIsVisible(){return signInButton.isDisplayed();}

}
