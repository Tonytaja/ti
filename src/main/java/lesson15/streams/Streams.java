package lesson15.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        var beverages =List.of(
                new Beverages("vine",15),
                new Beverages("beer",5),
                new Beverages("juice",10)
                );
        for (Beverages beverage: beverages){
            if (beverage.getPrice()>10) {
                System.out.println(beverage.getName());
            }
        }
        beverages.stream()
                .filter(beverages1 -> beverages1.getPrice()>10)
                .map(beverages13 ->  beverages13.getName())
                .collect(Collectors.toList())
                .forEach(beverages12 -> System.out.println(beverages12));





//        Predicate<Beverages>predicate=new Predicate<Beverages>() {
//            @Override
//            public boolean test(Beverages beverages) {
//                return beverages.getPrice()>10;
//            }
//        };



    }
}
