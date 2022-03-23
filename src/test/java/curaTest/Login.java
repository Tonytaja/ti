package curaTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class Login {



        @FindBy(xpath = "//*[contains(text(),'Make Appointment')]")
        private WebElement appointmentButton;
        @FindBy(xpath = "//input[@id='txt-username']")
        private WebElement userName;
        @FindBy(xpath = "//input[@id='txt-password']")
        private WebElement passwd;
        @FindBy(xpath = "//button[@id='btn-login']")
        private WebElement loginButton;
        public Login(){
            PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);}
    public void logIn() throws InterruptedException {
        appointmentButton.click();
        Thread.sleep(1000);
        userName.sendKeys("John Doe");
        Thread.sleep(1000);
        passwd.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);
        loginButton.click();

    }
}
