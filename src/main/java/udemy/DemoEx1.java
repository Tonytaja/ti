package udemy;

import java.util.Scanner;

public class DemoEx1 {
    public static void main(String[] args) {
        double  si,p,t,r;
        System.out.println("Enter principal amount");
        Scanner scanner=new Scanner(System.in);
        p =scanner.nextDouble();
        System.out.println("Enter tenure");
        t =scanner.nextDouble();
        System.out.println("Enter rate");
        r =scanner.nextDouble();
        si=(p*t*r)/100;
        System.out.println("Simple interest - "+ si);


    }
}
