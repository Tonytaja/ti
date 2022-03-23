package page;

import framework.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class FilterCompomentPersta {
    @FindBy(xpath ="//div[@id='search_filters']//section[./p[contains(text(),'Color')]]//a[contains(text(),'White')]" )
    WebElement colorWhite;
    public FilterCompomentPersta() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }
    public void selectColorWhite(){
        colorWhite.click();
    }

    public void selectFilterBySectionAndName(String section, String name){
        final String locator="//div[@id='search_filters']//section[./p[contains(text(),'Color')]]//a[contains(text(),'White')]";
        var by=By.xpath(String.format(locator,section,name));
        prepareDriver().findElement(by).click();
    }

}
