package edurekaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day1 {
    WebDriver driver;
    public void invokeBrowser(){
        try {
            System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

            driver.get("https://www.amazon.pl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchCourse(){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
        driver.findElement(By.className("nav-input")).click();


    }

    public static void main(String[] args) {

        Day1 myObj = new Day1();
        myObj.invokeBrowser();


    }
}
