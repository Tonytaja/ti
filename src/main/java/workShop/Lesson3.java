package workShop;

import java.io.IOException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) throws IOException {
        final double AVERAGE= 5167.41;
        final  double MEDIANA= 3403;
        Scanner scanner=new Scanner(System.in);

        String name = "Tom";
       // String nameN=scanner.nextLine();
        String ifFinish="N";
        int n = scanner.nextInt();
        int nSilnia=1;
        System.out.println("Make a choice, pick 1, 2,3 or 4");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("You want freedom");
                break;
            case 2:
                System.out.println("You want to be a slave");
                break;
            case 3:
                System.out.println("You pick the third option");
                break;
            case 4:
                System.out.println("Good bye");
                break;
            default:
                System.out.println("you are pathetic");
        }

//        for (int i=1; i<=n;i++ ){
//             nSilnia *= i;
//        }
//        System.out.println(n+" !" + nSilnia);

//        do {
//            System.out.println("Do you want to finish Y/N ?");
//            ifFinish=scanner.next();
//        }while (ifFinish.equals("Y"));

//        while (!ifFinish.equals("Y")) {
//            System.out.println("How much do you gain?");
//            double valueToCheck=scanner.nextDouble();
//
//
//            if (valueToCheck > AVERAGE) {
//                System.out.println("Your wages are more than average");
//            } else if (valueToCheck < AVERAGE) {
//                System.out.println("You are poor ");
//            } else if (valueToCheck == AVERAGE) {
//                System.out.println("You are nothing special");
//            } else
//                System.out.println("Sad face ");
//            System.out.println("Do you want to finish Y/N?");
//            ifFinish = scanner.nextLine();
//
//        }
//        System.out.println("End");
    }

}
