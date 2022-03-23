package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavSearch {

//input[@name='field-keywords']

    @FindBy(xpath = "//div[@id='nav-search']//div[@class='nav-search-field ']//input[@id='twotabsearchtextbox'][@class='nav-input nav-progressive-attribute']")
    private WebElement searchBar;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement test;

    @FindBy(css = "")
    private WebElement test2;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;

    @FindBy(xpath ="//div[@class='nav-search-facade']" )
    private WebElement searchFacade;



    public void search(UserData userData){
        searchBar.isEnabled();
        searchBar.sendKeys(userData.getSearchData());

        searchBar.click();
        searchButton.click();
    }
    public void ss(){
        test.sendKeys("ss");
        test.click();

    }
}
