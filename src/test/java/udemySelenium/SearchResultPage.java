package udemySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import udemyComponents.WebComponent;
import udemyComponents.impl.SearchResultItemComponent;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SearchResultPage extends WebPAge{

    private static final By SEARCH_RESULT_ITEM_SELECTOR = By.cssSelector(".repo-list-item");

    protected SearchResultPage(WebDriver driver) {
        super(driver);
    }


    public List<String> searchResultsItemsText(){
        return searchResultItems().stream()
                .map(WebComponent::getText)
                .collect(Collectors.toList());
    }
    public  List<String> searchResultsItemsWithText(String searchPhrase){
        return searchResultsItemsText().stream()
                .filter(item -> item.contains(searchPhrase))
                //.map(WebComponent::getText)
                //.filter(item -> item.contains(searchText))
                .collect(Collectors.toList());

    }
    private List<SearchResultItemComponent> searchResultItems(){
        return findElements(SEARCH_RESULT_ITEM_SELECTOR).stream()
                .map(SearchResultItemComponent::new)
                .collect(Collectors.toList());
    }
}
