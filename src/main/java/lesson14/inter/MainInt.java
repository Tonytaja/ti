package lesson14.inter;

public class MainInt {
    public static void main(String[] args) {
        Bacteria bacteria= new Bacteria();
        OxygenBreather cat= new Cat();

    }
    public void animalsNeedsOxygen(OxygenBreather oxygenBreather){
        oxygenBreather.breathe();
    }
}

class Animal{
    public void isAbleToMove(){};

}
class Mammals extends Animal{
    public void needMilk(){}
    public void viviparous(){}
}

class Bacteria extends Animal{

}
class Dolphin extends Mammals implements OxygenBreather{
    @Override
    public void breathe() {

    }
}
class Cat extends Mammals implements OxygenBreather{
    @Override
    public void breathe() {

    }
}
class Pepe implements OxygenBreather,Viviparous{
    @Override
    public void breathe() {

    }

    @Override
    public void iAmAlive() {

    }
}

