package page;

import models.NewUserData;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import static framework.DriverProvider.prepareDriver;

public class RegisterPageFindBy {

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;
    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;
    @FindBy(id = "days")
    private WebElement days;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(id = "years")
    private WebElement years;


    //private WebDriver driver;

    public RegisterPageFindBy() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(), 10), this);
    }

    public void fillNameFirstAndLast(String firstName, String lastName) {
        customerFirstName.sendKeys(firstName);
        customerLastName.sendKeys(lastName);

    }

    public void fillDate(String day, String month, String year) {
        new Select(days).selectByValue(day);
        new Select(months).selectByValue(month);
        new Select(years).selectByValue(year);
    }

    public RegisterPageFindBy fillUserData(NewUserData newUser) {
        customerFirstName.sendKeys(newUser.getName());
        customerLastName.sendKeys(newUser.getLastName());
        days.sendKeys(newUser.getDbDay().toString());
        months.sendKeys(newUser.getDbMonth());
        return this;

    }

    public NewUserData getDataFromPageFluent() {
        return new NewUserData.NewUserDataBuilder()
                .setName(customerFirstName.getText())
                .setLastName(customerLastName.getText())
                .setDbDay(Integer.valueOf(days.getText()))
                //........
                .build();
    }

    public RegisterPageFindBy  checkIfUserOnPageIsSame(NewUserData newUserData){
        Assertions.assertEquals(getDataFromPage(),newUserData);
        return this;
    }
    private NewUserData getDataFromPage() {
        return new NewUserData.NewUserDataBuilder()
                .setName(customerFirstName.getText())
                .setLastName(customerLastName.getText())
                .setDbDay(Integer.valueOf(days.getText()))
                //........
                .build();
    }
}
