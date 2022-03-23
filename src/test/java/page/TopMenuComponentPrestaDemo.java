package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class TopMenuComponentPrestaDemo {
    @FindBy(xpath = "//ul[@id=\"top-menu\"]//a[contains(.,\"Clothes\")]")
    private WebElement clothesButton;

    @FindBy(xpath = "//ul[@id=\"top-menu\"]//a[contains(.,\"Accessories\")]")
    private WebElement accessoriesButton;

    @FindBy(xpath = "//ul[@id=\"top-menu\"]//a[contains(.,\"Art\")]")
    private WebElement artButton;
    public TopMenuComponentPrestaDemo() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }
    public void clickClothesButton() {
        clothesButton.click();
    }
}
////ul[@id="top-menu"]//a[contains(.,"Clothes")]
