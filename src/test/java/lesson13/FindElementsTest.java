package lesson13;

import framework.DriverProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static framework.DriverProvider.prepareDriver;


public class FindElementsTest {
    @BeforeEach
    void beforeEach() {

        prepareDriver().get("http://automationpractice.com/index.php?id_category=3&controller=category");



    }
    @Test
    void findElementsTest() {
        var driver =prepareDriver();
        var items=driver.findElements(By.cssSelector(".product_list > li"));
        var texts= new ArrayList<String>();
        for (WebElement element: items){
            if (element.findElement(By.cssSelector("a.product-name")).getText()=="Blouse"){
              //  texts.add(element);
            }
        }
        System.out.println(texts);

       List<WebElement> itemsStream= items.stream()
                .filter(webElement -> webElement.findElement(By.cssSelector("a.product-name")).getText()=="Blouse")
                .collect(Collectors.toList());



        Arrays.asList("as","sada","sada");  //works the same as other lists
        Collections.emptyList();

    }
    @Test
    void arraysInJava(){
     int[] myArray= new int[10];
     String[] myString={"asdd","asd"};
     int position2 =myArray [1];
     myArray[4]=13;
     int[] myArray2={0,1,2,3,4,5,6,7,9,8};
     //You can't write like this
        //System.out.println(myArray2);
        for (int i=0; i<myArray2.length; i++){
            System.out.println(myArray2[i]);
        }

        for (int i: myArray2){
            System.out.println(i);
        }
    }
    }

