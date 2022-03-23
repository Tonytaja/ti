package page;

import models.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginPage {

    private final By email = By.id("email");
    private final By password = By.id("passwd");
    private final By submit= By.id("SubmitLogin");
    private final  By createEmail=By.id("email_create");
    private final By submitCreate=By.id("SubmitCreate");
    private final By errorBox= By.cssSelector(".pages-heading");
    private WebDriver driver;
    private WebDriverWait waiter;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        var waiter = new WebDriverWait(driver, 10L);

    }
    public void login(String login, String passwd){
        driver.findElement(email).sendKeys(login);
        driver.findElement(password).sendKeys(passwd);
        driver.findElement(submit).click();
    }
    public void login(UserCredentials userCredentials){
        driver.findElement(email).sendKeys(userCredentials.getLogin());
        driver.findElement(password).sendKeys(userCredentials.getPassword());
        driver.findElement(submit).click();
    }

    public void createNewAccount(String email){
        waiter.until(visibilityOfElementLocated(By.cssSelector("#email_create")));
        driver.findElement(createEmail).sendKeys(email);
        driver.findElement(submitCreate).click();
    }
    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getSubmit() {
        return submit;
    }

    public By getCreateEmail() {
        return createEmail;
    }

    public By getSubmitCreate() {
        return submitCreate;
    }

    public By getErrorBox() {
        return errorBox;
    }




}
