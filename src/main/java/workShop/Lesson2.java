package workShop;

import java.util.Locale;

public class Lesson2 {
    public static void main(String[] args) {
        String welcome = "Hello everyone";
        String goodbye="bye bye  see you ";
        System.out.println(welcome.substring(0,5));
        System.out.println(welcome.substring(6));
        System.out.println(welcome.split(" ")[0]);
        System.out.println(welcome.split(" ")[1]);
        int win = welcome.length()+goodbye.length();
        System.out.println(welcome.length());
        System.out.println(win);
        if (welcome.compareTo(goodbye)<0){
            System.out.println("No");
        } else
            System.out.println("Yes");
        System.out.println(welcome.substring(1,3));

        System.out.println(welcome.substring(0,1).toUpperCase(Locale.ROOT) +welcome.substring(1) +" " + goodbye.substring(0,1).toUpperCase(Locale.ROOT)+goodbye.substring(1));


    }
}
