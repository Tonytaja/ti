package lesson11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.RegisterPage;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class IframeDriverPop {

    private WebDriver driver;
    private LoginPage loginPage;
    private RegisterPage registerPage;


    @BeforeEach
    void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
    }

    @Test
    void seleniumActions() {
        //css ->  a[title=Women]
        // xpath ->//a[@title="Women"]

        final var blouseSelector = By.xpath("//img[@title='Blouse']");

        driver.findElement(By.cssSelector("a[title=Women]")).click();

        var waiter = new WebDriverWait(driver, 10L);
        waiter.until(visibilityOfElementLocated(blouseSelector));

        var blouseImg = driver.findElement(blouseSelector);
        new Actions(driver).moveToElement(blouseImg).click().perform();

        final var iframe = By.tagName("iframe");
        waiter.until(visibilityOfElementLocated(iframe));

        var iframeElement = driver.findElement(iframe);

        driver.switchTo().frame(iframeElement);
        driver.findElement(By.xpath("//button[contains(.,\"cart\")]")).click();

        driver.switchTo().defaultContent();

        //assertion 1
//        Assertions.assertTrue(driver.findElement(By.xpath("//div[@id='layer_cart']//h2[contains(.,'Product successfully added to your shopping cart\n')]")).isDisplayed());
//assertion 2
//        driver.findElement(By.xpath("//div[@id='layer_cart']//h2[contains(.,'Product successfully added to your shopping cart\n')]")).isDisplayed();
//        driver.findElement(By.xpath("//div[@id='layer_cart']//h2[contains(.,'successfully')]")).getText();
        //assertion 3
        driver.findElement(By.xpath("//div[@id='layer_cart']//h2")).isDisplayed();
        driver.findElement(By.xpath("//div[@id='layer_cart']//h2")).getText().equals("Product successfully added to your shopping cart");
        driver.getWindowHandle();
    }

    @Test
    void seleniumPopOne() {

        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);

        loginPage.createNewAccount("toas@ss.sscom");
        driver.findElement(By.cssSelector("#id_gender1")).click();
        registerPage.fillNameFirstAndLast("Tony","Stark");
        driver.findElement(By.id("passwd")).sendKeys("1235asd");
        registerPage.fillDate("12","2","2222");
    }

    @Test
    void seleniumPopTwo() {

        driver.findElement(By.cssSelector("a.login")).click();
        loginPage.createNewAccount("toas@ss.sscom");

    }
}
