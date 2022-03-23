package curaTest;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static framework.DriverProvider.prepareDriver;


public class Tests {
    private Login login;
    private Appointment appointment;
    private LogOut logOut;

    @BeforeEach
    void beforeEach(){
        prepareDriver().get("https://katalon-demo-cura.herokuapp.com/");
        prepareDriver().manage().window().maximize();
        login = new Login();
        appointment = new Appointment();
        logOut = new LogOut();



    }
    @Test
    void loginTest() throws InterruptedException {
        login.logIn();

    }
    @Test
    void appointmentTest() throws InterruptedException {
        appointment.appointments();

    }
    @Test
    void loginOut() throws InterruptedException {
        logOut.logOut();
    }
}
