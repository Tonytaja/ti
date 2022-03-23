package page;

import framework.DriverProvider;
import lesson15.streams.Streams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FilterTestPresta {
    @ParameterizedTest
    @MethodSource("method")
    void filterTestPresta(String filterSection, String filterName, int noOfElements, String elementName){

        DriverProvider.prepareDriver().get("https://demo.prestashop.com/#/en/front");
        TopMenuComponentPrestaDemo topMenuComponentPrestaDemo = new TopMenuComponentPrestaDemo();
        topMenuComponentPrestaDemo.clickClothesButton();

        FilterCompomentPersta filterCompomentPersta= new FilterCompomentPersta();
        filterCompomentPersta.selectFilterBySectionAndName(filterSection,filterName);

        ProductGrid productGrid= new ProductGrid();
        Assertions.assertTrue(productGrid.checkIfProductWithNameExist(elementName));
        Assertions.assertEquals(noOfElements,productGrid);

    }
    private static Stream<Arguments> method(){
        return Stream.of(
                Arguments.of("Color","White",3,"Mountains Fox Cushion"),
                Arguments.of("Brand","Studio Design",7,"Brown Bear Cushion"),
                Arguments.of("Composition","Ceramic",4,"Mug The Adventure Begin")
        );
    }
}
