package mouseAutomation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static framework.DriverProvider.prepareDriver;

public class Mouse {
    private Slider slider;
    private MultiKeyOperation multiKeyOperation;
    private JavaAlerts javaAlerts;

    @BeforeEach
    void beforeEach(){

       // prepareDriver().get("https://www.webfx.com/web-design/color-picker/");
        prepareDriver().get("https://www.dezlearn.com/javascript-alerts/");
        prepareDriver().manage().window().maximize();
        slider= new Slider();
        multiKeyOperation = new MultiKeyOperation();
        javaAlerts= new JavaAlerts();


    }


        @Test
    void slider(){
        slider.slider();
        slider.dot();
        }
        @Test
    void multiKey(){
        multiKeyOperation.multiKey();
        }
    @Test
    void javaAlert() throws InterruptedException {
        javaAlerts.simpleAlert();
       javaAlerts.promptBox();
        javaAlerts.confirmationBox();
    }
    }

