package workShop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hou many numbers do you need ?");
        int number= scanner.nextInt();
        System.out.println("Which number is the biggest ?");
        int num = scanner.nextInt();



        int numbers []= new int[num];
        for (int i=0; i<numbers.length; i++){
            numbers[i]=i+1;
        }
        int [] results = new int[number];
        for ( int i = 0; i< results.length; i++){
            int r = (int) Math.random()*num;

            results[i]=numbers[r];
            numbers[r]=numbers[num=1];
            num--;
        }
        Arrays.sort(results);
        System.out.println("The bigger is "+ Arrays.toString(results));


//        int [] a = new int[100];
//        int[] smallPrimes={2,3,5,6,7,8,9};
//        int [][] c= new int[12][2];
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(smallPrimes));
//        System.out.println(Arrays.toString(b));
//        for (int i=0; i<a.length; i++){
//            a[i]=i+1;
//        }
//        System.out.println(Arrays.toString(a));
//        String [] names = {"Thomas","Alex"};
//        String [] newNames = names;
//        names[1]="Tina";
//        names= Arrays.copyOf(names,4);
//        for (int i=0; i<names.length; i++){
//            System.out.println(names[i]);
//        }
    }
}
