package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class AddToTheCart {

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement cartButton;

    @FindBy(xpath = "//span[@class='a-button-inner']//*[contains(text(), 'Przejdź do koszyka')]")
    private WebElement moveToCart;

    @FindBy(xpath = "//a[@id='nav-cart']")
    private WebElement checkCartButton;

    @FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
    private WebElement checkoutButton;

    public AddToTheCart(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void addToCart(){
        cartButton.click();
       // moveToCart.click();
        checkCartButton.isDisplayed();
        checkCartButton.click();
    }
    public void cart(){
        checkCartButton.click();
    }

}
