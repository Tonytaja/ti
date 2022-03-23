package udemyComponents.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import udemyComponents.WebComponent;

import java.util.Locale;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR =By.cssSelector(".v-align-middle");
    private static final By DESCRIPTION_SELECTOR =By.cssSelector(".mb-1");

    public SearchResultItemComponent(WebElement rootElement) {
        super(rootElement);
    }
    public boolean containsSearchPhrase(String searchPhrase){
        return containsSearchPhrase(searchPhrase,TITLE_SELECTOR)
                || containsSearchPhrase(searchPhrase, DESCRIPTION_SELECTOR);
    }
    private boolean containsSearchPhrase(String searchPhrase, By selector){
        return findElement(selector).getText().toLowerCase().contains(searchPhrase);
    }

}
