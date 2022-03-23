package lesson9;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @BeforeAll
    static void  beforeAll(){
        System.out.println("Before all");
    }


    @Test
    void firstSeleniumTest() {
        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/index.php");

        By locator= By.cssSelector("a.login");
        var loginButton=driver.findElement(locator);
        loginButton.click();
        //or
       // driver.findElement(By.cssSelector("a.login")).click();
        //driver.close();
        //driver.quit();

    }


    @Test
    void dummyTestOne() {
        System.out.println("Test2");

    }

    @Test
    void dummyTestTwo() {
        System.out.println("Test3");

    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

}
