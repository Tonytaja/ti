package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class NavMain {

    @FindBy (xpath = "//div[@id='nav-main']")
    private WebElement navBar;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_5']")
    private WebElement customerServiceButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_4']")
    private WebElement sellOnAmazonButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_3']")
    private WebElement giftCardButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_2']")
    private WebElement bestsellersButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_1']")
    private WebElement salesButton;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//a[@data-menu-id='2']")
    private WebElement hamburgerMenuEchoAlexa;

    @FindBy(xpath = "//a[@data-menu-id='3']")
    private WebElement hamburgerMenuEbook;

    @FindBy(xpath = "//a[@data-menu-id='5']")
    private WebElement hamburgerMenuBooks;

    @FindBy(xpath = "//a[@data-menu-id='6']")
    private WebElement hamburgerMenuComputers;

    @FindBy(xpath = "//*[contains(text(),'Bestsellery po angielsku')]")
    private WebElement menuBooksInEnglish;

    public NavMain(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void menuBooks(){
        hamburgerMenu.click();
        hamburgerMenuBooks.isDisplayed();
        hamburgerMenuBooks.click();
        menuBooksInEnglish.isEnabled();
        menuBooksInEnglish.click();

    }
}
