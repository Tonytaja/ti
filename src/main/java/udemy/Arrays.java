package udemy;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int n= 2;
        int arr[]=new int[n];
        Scanner scanner=new Scanner(System.in);
        int i;
        for (i=0; i< arr.length; i++){
            System.out.printf("enter %d element \n",i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("values in the array are");
        for (i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("values in the array are");
        for (int ele:arr){
            System.out.println(ele);
        }
    }
}
