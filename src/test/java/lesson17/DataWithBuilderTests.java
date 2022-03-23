package lesson17;

import models.NewUserData;
import models.UserCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.DarkNaviBarFindBy;
import page.LoginPageFindBy;
import page.RegisterPageFindBy;

import static framework.DriverProvider.prepareDriver;

public class DataWithBuilderTests {

    private LoginPageFindBy loginPage;
    private RegisterPageFindBy registerPage;
    private DarkNaviBarFindBy darkNaviBarFindBy;

    @Test
    void beforeEach() {
        prepareDriver().get("http://automationpractice.com/index.php");
        var loginPage = new LoginPageFindBy();
        var registerPage = new RegisterPageFindBy();
        var darkNaviBarFindBy = new DarkNaviBarFindBy();
        var user = UserCredentials.getRandomUser();
        var newUser= NewUserData.getGenericUser().build();

       var userFromPage= darkNaviBarFindBy
                .goToLoginPageFluent()
                .createNewAccountFluent(user.getLogin())
                .fillUserData(newUser)
               .checkIfUserOnPageIsSame(newUser);



        //Assertions.assertEquals(newUser, userFromPage);


        // loginPage.createNewAccount(user.getLogin());


        new NewUserData.NewUserDataBuilder()
                .setCity("Sosnowiec")
                .build();


       // registerPage.fillNameFirstAndLast();
    }
}
