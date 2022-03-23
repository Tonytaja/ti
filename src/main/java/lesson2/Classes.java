package lesson2;

public class Classes {

    public static void main(String[] args) {

        Human tom = new Human();
        tom.walk();
        tom.increaseAge();

        Human alex = new Human();
        alex.walk();
        alex.increaseAge();
        alex.increaseAge();
        var age = alex.getAge();
        System.out.println(age);
    }
}
