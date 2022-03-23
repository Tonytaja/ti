package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class MenuBooks {

    @FindBy(xpath = "//div[@id='s-refinements']")
    private WebElement languages;

    @FindBy(xpath = "//a[@class='a-link-normal']//*[contains(text(),'Angielski')]")
    private WebElement englishBooks;

    @FindBy(xpath = "//div[@class='a-section']//*[contains(text(),'Science fiction i fantasy')]")
    private WebElement sciFiBooks;

    @FindBy(xpath = "//img[@class='s-image'][@data-image-index='6']")
    private WebElement witcherBook;

    public MenuBooks(){
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }

    public void menuBooks(){
        englishBooks.isDisplayed();
        englishBooks.click();
        sciFiBooks.isDisplayed();
        sciFiBooks.click();
        witcherBook.click();
    }

}
