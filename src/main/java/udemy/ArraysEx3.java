package udemy;

import java.util.Scanner;

public class ArraysEx3 {
    static int search(int arr[], int searchElement){
        boolean found=false;
        int i;
        for (i=0;i<arr.length; i++){
            if (arr[i]==searchElement){
                found=true;
                break;
            }
        }
        if (found)return i;
        else
            return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,20};
        int searchElement;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter element to search");
        searchElement=scanner.nextInt();
        int index= search(arr,searchElement);
        if (index != -1){
            System.out.println("found at "+index);
        } else {
            System.out.println("mot found");
        }
    }
}
