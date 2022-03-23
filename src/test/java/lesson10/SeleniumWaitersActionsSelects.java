package lesson10;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SeleniumWaitersActionsSelects {


    private WebDriver driver;

    @BeforeEach
    void beforeEach(){
        System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    void seleniumImplicitWait() {

        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("a.login")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys("test123@aaa.com");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Tom");
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Stark");
        driver.findElement(By.id("passwd")).sendKeys("1235asd");


        new Select(driver.findElement(By.id("days"))).selectByValue("1");
        new Select(driver.findElement(By.id("months"))).selectByValue("5");
        new Select(driver.findElement(By.id("years"))).selectByValue("1979");
        driver.quit();
    }
    @Test
    void seleniumExplicitWaiter(){

        driver.findElement(By.cssSelector("a.login")).click();

        var waiter =new WebDriverWait(driver,10L);

        waiter.until(visibilityOfElementLocated(By.cssSelector("#email_create")));
        driver.findElement(By.cssSelector("#email_create")).sendKeys("test123@aaa.com");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
    }

    @Test
    void seleniumActions(){
        //css ->  a[title=Women]
        // xpath ->//a[@title="Women"]

        driver.findElement(By.cssSelector("a[title=Women]")).click();
        var waiter = new WebDriverWait(driver,10L);
        waiter.until(visibilityOfElementLocated(By.cssSelector("//img[@title='Blouse']")));

        var blouseImg =driver.findElement(By.cssSelector("//img[@title='Blouse']"));
        new Actions(driver).moveToElement(blouseImg).click().perform();
    }


}
