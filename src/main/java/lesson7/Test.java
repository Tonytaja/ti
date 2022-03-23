package lesson7;

import lesson2.Human;

public class Test {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.setAge(199);
        HumanWithConstructor sam = new HumanWithConstructor(1.8, "dark", 109,78);
        HumanWithConstructor jack = new HumanWithConstructor(1.7, "blue", 19,false);

        System.out.println(sam.getAge());
        System.out.println(tom.getAge());

        HumanWithConstructor aga = new HumanWithConstructor();

    }
}
