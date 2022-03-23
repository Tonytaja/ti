package lesson13;

import java.util.HashSet;

public class Sets{
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("test");
        set.add("test2");
        set.add("test4");

        for (String element : set){
            System.out.println(element);
        }
    }



}
