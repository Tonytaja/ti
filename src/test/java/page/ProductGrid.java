package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static framework.DriverProvider.prepareDriver;

public class ProductGrid {

    @FindBy(css= "div.products >div.product")
    List<WebElement> products;

    public ProductGrid() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
    }
public boolean checkIfProductWithNameExist(String name ) {
    List<String> texts = new ArrayList<>();
    for (WebElement product : products) {

        texts.add(product.findElement(By.xpath(".//h2/a")).getText());

    }
//    public boolean checkIfProductWithNameExist (String name ){
//        products.stream().filter(webElement -> webElement.findElement(By.xpath(".//h2/a")))
//
//        for (WebElement product : products) {
//
//            texts.add(product.findElement(By.xpath(".//h2/a")).getText());
//
//        }
//        return texts.contains(name);
//    }

//    public boolean checkIfProductWithNameExistStream(String name){
//        return products.stream()
//                .anyMatch(webElement -> webElement
//                        .findElement(By.xpath(".//h2/a"))
//                        .getText()
//                        .equals(name));
//    }
//    public int returnNumberOfProducts(){
//        return products.size();
//    }
//OR
//        Predicate <WebElement> filtr = new Predicate<WebElement>() {
//            @Override
//            public boolean test(WebElement webElement) {
//              return   webElement.findElement(By.xpath(".//h2/a")).getText().equals("Mountain Fox Cushion");
//            }
//        }



        if (texts.contains(name)) {
            return true;
        } else {
            return false;
        }
    }
}
