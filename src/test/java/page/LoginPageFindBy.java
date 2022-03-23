package page;

import models.UserCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.DriverProvider.prepareDriver;

public class LoginPageFindBy {

    private WebDriver driver;
    private WebDriverWait waiter;

    @FindBy(id="email")
    private  WebElement  email;

    @FindBy(id="passwd")
    private  WebElement  passwd;

    @FindBy(css="#SubmitLogin")
    private  WebElement  submit;

    @FindBy(id="email_create")
    private  WebElement  createEmail;

    @FindBy(id="SubmitCreate")
    private  WebElement  submitCreate;

    @FindBy(id="create_account_error")
    private  WebElement  errorBox;

    @FindBy(id=".alert-danger")
    private  WebElement  errorBoxAtLogin;

    @FindBy(css=".pages-heading")
    private  WebElement  pageHeading;


    public LoginPageFindBy(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void login(String login, String password){
        email.sendKeys(login);
        passwd.sendKeys(password);
        submit.click();
    }
    public void login(UserCredentials userCredentials){
        email.sendKeys(userCredentials.getLogin());
        passwd.sendKeys(userCredentials.getPassword());
        submit.click();
    }
    public void createNewAccount(String email){
        createEmail.sendKeys(email);
        submitCreate.click();
    }
    public RegisterPageFindBy createNewAccountFluent(String email){
        createEmail.sendKeys(email);
        submitCreate.click();
        return new RegisterPageFindBy();
    }
}
