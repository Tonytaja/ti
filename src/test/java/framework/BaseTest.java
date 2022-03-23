package framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static framework.DriverProvider.prepareDriver;
import static framework.DriverProvider.quitWebDriver;

public class BaseTest {
    @AfterEach
    void afterEach(){
       quitWebDriver();
    }
}
