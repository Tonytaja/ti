package lesson15.interfaceFuncional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator= new Calculator();
        Operations add = new Add();
        double calc =scanner.nextDouble();
        Operations subtract= new Subtract();
        Operations multiple= new Multiple();
        Operations divide = new Divide();
        System.out.println(calc);

        Operations exxx = (double a, double b) -> a/b;


        calculator.execute(2,2,(a,b) -> a/b);
        calculator.execute(2,2,(a,b) -> a*b);
        calculator.execute(2,2,(a,b) -> a-b);
        calculator.execute(2,2,(a,b) -> a+b);

    }
}
