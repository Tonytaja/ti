package lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer,String> students= new HashMap<>();
        students.put(1,"Thomas Stark");
        students.put(2,"Alex Costanza");
        students.put(3,"Astrid Hohhenzol");

        System.out.println(students);
        students.values();
        students.keySet();
        System.out.println(students.keySet());

        for (Map.Entry<Integer,String> wpis: students.entrySet()){
            Integer studentId = wpis.getKey();
            String studentName= wpis.getValue();
            System.out.println("Key: "+studentId+ " Value: "+studentName);
        }

        System.out.println("Students values: ");
        Set<String> studentValues= new HashSet<>(students.values());
        for (String student: studentValues){
            System.out.println(student);
        }
        System.out.println("Students values: ");
        Set<Integer> studentKeys= students.keySet();
        for (Integer student: studentKeys){
            System.out.println(student);
        }



    }
}
