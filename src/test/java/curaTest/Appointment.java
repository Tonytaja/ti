package curaTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class Appointment {
    @FindBy(xpath = "//select[@id='combo_facility']")
    private WebElement facility;
    @FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
    private WebElement checkBox;
    @FindBy(xpath = "//input[@id='radio_program_medicaid']")
    private WebElement healthProgram;
    @FindBy(xpath = "//input[@id='txt_visit_date']")
    private WebElement data;
    @FindBy(xpath = "//textarea[@id='txt_comment']")
    private WebElement comment;
    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    private WebElement bookAppointmentButton;
    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement goToPageButton;


    public Appointment(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);}

    public void appointments() throws InterruptedException {
        checkBox.click();
        healthProgram.click();
        data.sendKeys("12/05/2022");
        comment.sendKeys("Hi");
        Thread.sleep(1000);
        bookAppointmentButton.click();
        Thread.sleep(1000);
        goToPageButton.click();


    }
}
