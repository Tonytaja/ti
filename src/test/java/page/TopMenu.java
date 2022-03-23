package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class TopMenu {
//div#block_top_menu //div[@id='block_top_menu']

    @FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Women']")
    private WebElement womenButton;

    @FindBy(xpath = "//div[@id='block_top_menu']//a[@title='T-shirts']")
    private WebElement tShirtButton;

    @FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Dresses']")
    private WebElement dressesButton;

    public TopMenu() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void clickWomenButton() {
        womenButton.click();
    }
}
