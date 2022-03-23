package workShop;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        Scanner inFile = new Scanner(Path.of("C:\\Users\\Tomasz\\IdeaProjects\\Demo\\src\\workShop\\test"));
//        System.out.println("Tell me your name  ");
//        String name = scanner.next();
//        String surname = scanner.next();
//        System.out.println("Hello "+ name + surname);
//        System.out.println("When were you born?");
//        int birth= scanner.nextInt();
//        System.out.println("You were born in " +birth);
//        System.out.println( "You are "+ (2021- birth)+" old");
        System.out.println(inFile.nextLine());
        System.out.println(inFile.hasNext());
        System.out.println(inFile.nextLine());
        System.out.println(inFile.hasNext());
        System.out.println(inFile.nextLine());
        System.out.println(inFile.hasNext());
    }
}
