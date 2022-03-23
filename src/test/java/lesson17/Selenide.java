package lesson17;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPageSelenide;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Selenide {

    @Test
    void test(){
        // WebDriverRunner.

        open("http://automationpractice.com/index.php");
        Configuration.timeout=10;

        $("a.login").click();


        $(By.cssSelector("a.login")).click();
        $("#email_create").setValue("test123@aaa.com");
        $("#SubmitCreate").click();
        $("#id_gender1").click();

        $(id("#customer_firstname")).setValue("Tom");
        $(id("#customer_lastname")).setValue("Stark");

        $("passwd").setValue("1235asd");


        $(id("days")).selectOptionContainingText("1");
        $(id("months")).selectOptionByValue("5");
        $(id("years")).selectOption("1979");

        assertEquals($(id("days")).getSelectedOption().getText(),"1");
        //it is the same as
      //  $(id("days")).getSelectedOption().shouldHave(text("5"));
    }
    @Test
    void seleniumActions(){

        $("a[title=Women]").click();
        var blouseImg =$("//img[@title='Blouse']").shouldBe(visible);

        new Actions(WebDriverRunner.getWebDriver())
                .click(blouseImg)
                .perform();
    }
    @Test
    public void testOnCollections(){
        open("http://automationpractice.com/index.php");
        $x(".//a[@title='Women']").click();
        var listOfBlouse=$$(".product_list > li").stream().filter(selenideElement -> selenideElement
                .$("left-block img")
                .getAttribute("title")
                .equals("Blouse"))
                .collect(Collectors.toList());

        //or

        $$("product_list > li").filterBy(Condition.attribute("title","Blouse")).first();
    }
    @Test
    void loginPageError(){
        var loginPageSelenide = new LoginPageSelenide();
        open("http://automationpractice.com/index.php");
        $(By.cssSelector("a.login")).click();
        loginPageSelenide.login(",","");
        Assertions.assertTrue(loginPageSelenide.isErrorAtLoginVisible());
        loginPageSelenide.getAlertDanger().shouldBe(visible);

    }
}