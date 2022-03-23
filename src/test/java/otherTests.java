import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class otherTests {

    @Test
    void cdAction(){
        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='style-scope ytd-searchbox']//input[@id='search']")).sendKeys("sabaton");




    }
}
