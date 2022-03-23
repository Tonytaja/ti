package lesson15;

import models.UserCredentials;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.LoginPageFindBy;
import page.RegisterPageFindBy;

import static framework.DriverProvider.prepareDriver;

public class LoginTest {
    private LoginPageFindBy loginPage;
    private RegisterPageFindBy registerPage;

    @BeforeEach
    void beforeEach() {
        prepareDriver().get("http://automationpractice.com/index.php");
        loginPage = new LoginPageFindBy();
        registerPage = new RegisterPageFindBy();

    }

    @Test
    void seleniumPopOne() {


        WebElement loginButton = prepareDriver().findElement(By.cssSelector("a.login"));
        loginButton.click();
        loginPage.login(UserCredentials.getRandomUser());
    }
}
