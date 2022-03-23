package lesson13;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {

        int[] newArray= new int[10];

        int abc=123;
        Integer.valueOf(abc);

       Integer a= Integer.valueOf(23);
       Integer newest=abc;

        ArrayList<Integer> newArrayList =new ArrayList<>();
        var newArrayList2 =new ArrayList<Integer>();
        var newArrays=new ArrayList<String>();
        newArrayList.add(1234);
        newArrayList.add(2222);
        newArrayList.add(2);
        System.out.println(newArrayList);
        for (int i=0; i<newArrayList.size(); i++){
            System.out.println(newArrayList.get(i));
        }
        newArrayList.set(2,24);
        newArrayList.remove(2);

    }
}
