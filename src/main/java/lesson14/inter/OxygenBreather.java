package lesson14.inter;

public interface OxygenBreather {

     default void breathe(){
         System.out.println("I breathe");
     }
}
