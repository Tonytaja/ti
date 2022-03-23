package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private final By customerFirstName= By.id("customer_firstname");
    private final By customerLastName= By.id("customer_lastname");
    private final By days= By.id("days");
    private final By months= By.id("months");
    private final By years= By.id("years");
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillNameFirstAndLast(String firstName, String lastName){
        driver.findElement(customerFirstName).sendKeys(firstName);
        driver.findElement(customerLastName).sendKeys(lastName);

    }
    public void fillDate(String day, String month, String year){
        new Select(driver.findElement(days)).selectByValue(day);
        new Select(driver.findElement(months)).selectByValue(month);
        new Select(driver.findElement(years)).selectByValue(year);
    }
}
