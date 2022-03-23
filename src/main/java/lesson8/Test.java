package lesson8;

import lesson8.composition.Body;
import lesson8.composition.CompositionCar;
import lesson8.composition.Engine;
import lesson8.composition.Wheels;
import lesson8.encapsulation.Account;
import lesson8.inheritance.Car;
import lesson8.inheritance.Plane;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Mruczek");
        System.out.println(cat.getName());
        Car skoda = new Car("Skoda", 5, 4, false, 5);
        Plane airbus = new Plane("airbus", 8, 6, 2, 222);
        skoda.move();
        airbus.stop();

        Account account= new Account("Tim",1111);
        account.deposit(2342332);
        account.getBalance();
        account.withdraw(2222);


        Engine engine= new Engine(100,4,5,false);
        Body body= new Body(2,5,"coupe",false);
        Wheels wheels=new Wheels(14,100,true);

        CompositionCar opel= new CompositionCar(body,engine,wheels,"opel","corsa");
        opel.goSomewhere();


    }
}
