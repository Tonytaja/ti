package hackerRank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//constrains 1<=s<=100
        //0<=start<end<=n
        // s cpmsist [a-z][A-Z]
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a full text");
        String s =scanner.nextLine();
 //       s.
        s.substring(2,4);
//        if ((s.contains(a-z) || s.contains(A-Z) )) {
//            System.out.println("Please enter a start number");
//            int start = scanner.nextInt();
//            System.out.println("Please enter the last number");
//            int end = scanner.nextInt();
//        }else{
//            System.out.println("Your text is wrong");
//        }
        System.out.println(s.length());
        System.out.println(s.substring(0,2));

    }
}
