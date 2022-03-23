package page;

import com.codeborne.selenide.SelenideElement;
import models.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageSelenide  {
    
    public SelenideElement password= $("#passwd");
    
    public void login(String email, String password){
        $("#email").setValue(email);
        $("#passwd").setValue(password);
        $("#SubmitLogin").click();
    }
    
    public void login(UserCredentials userCredentials){
        login(userCredentials.getLogin(),userCredentials.getPassword());
    }
    
    public void clickSubmitCreate(){$("$SubmitCreate").click();}
    
    public boolean isErrorAtLoginVisible(){return $(".alert-danger").isDisplayed();}
    public SelenideElement getAlertDanger(){
        return $(".alert-danger");
    }
    public List<String> getErrorsFromBox(){
        return $("#create_account_error").findElements(By.cssSelector(".alert-danger li"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
    public SelenideElement getPassword(){return password;}
}
