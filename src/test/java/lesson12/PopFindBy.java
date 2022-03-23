package lesson12;

import framework.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.LoginPageFindBy;
import page.RegisterPageFindBy;


import static framework.DriverProvider.prepareDriver;

public class PopFindBy extends BaseTest {

    private LoginPageFindBy loginPage;
    private RegisterPageFindBy registerPage;


    @BeforeEach
    void beforeEach() {
        prepareDriver().get("http://automationpractice.com/index.php");
        loginPage = new LoginPageFindBy();
        registerPage= new RegisterPageFindBy();

    }
    @Test
    void seleniumPopOne() {

        WebElement loginButton= prepareDriver().findElement(By.cssSelector("a.login"));
        loginButton.click();
        loginPage.createNewAccount("toas@ss.sscom");
        registerPage.fillNameFirstAndLast("Tony","Stark");
        prepareDriver().findElement(By.id("passwd")).sendKeys("1235asd");
        registerPage.fillDate("12","2","2012");
    }




    @Test
    void seleniumPopTwo() {
        WebElement loginButton= prepareDriver().findElement(By.cssSelector("a.login"));
        loginButton.click();
        prepareDriver().findElement(By.cssSelector("a.login")).click();
        loginPage.createNewAccount("toas@ss.sscom");

    }

}
