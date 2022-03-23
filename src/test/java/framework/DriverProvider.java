package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DriverProvider {

    private static WebDriver driver=null;
    private static final String browserName="Chrome";

    private DriverProvider(){

    }

    public static void quitWebDriver(){
        driver.quit();
        driver=null;
    }

    public static WebDriver prepareDriver(){

        if (driver==null) {
            selectDriver();
        }
        return driver;
    }

    private static void selectDriver(){
        switch (getProperties().getProperty("browserName")){
            case "FireFox":
                System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver",getProperties().getProperty("chromePath"));
                driver=new ChromeDriver();
                break;

        }

    }
    private static Properties getProperties(){
        Properties properties = new Properties();
        InputStream inputStream= DriverProvider.class.getResourceAsStream("/config.properties");

        try {
            properties.load(inputStream);
        }catch (IOException exception){
            exception.getStackTrace();
        }

        return properties;

    }
}
