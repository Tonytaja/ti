package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class TopMenuAmazon {
    @FindBy(xpath = "//div[@id='nav-main']//a[@id='nav-hamburger-menu']")
    private WebElement menuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[@data-menu-id='4']")
    private WebElement books;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[@data-menu-id='4']")
    private WebElement sa;

    @FindBy(xpath = "//li[contains(.,'Wszystkie książki')]")
    private WebElement allBooksButton;
    public TopMenuAmazon() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }
    public void clickMenuButton() {menuButton.click();
    }
    public void clickBookMenu(){books.click();}
    public void clickAllBooks(){allBooksButton.click();}
    public void cl(){sa.click();}
}
