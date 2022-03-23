package lesson7;

public class Plane {

    public static double calculator = 0.1231;
    private final int noOfSeats;
    private final int noOfEngines;
    private double fuelCapacity;
    private final boolean canTankOnAir;
    private String name;

    public Plane(String name, int noOfSeats, int noOfEngines, int fuelCapacity, boolean canTankOnAir) {
        this.name = name;
        if (noOfSeats < 1) {
            this.noOfSeats = 100;
        } else {
            this.noOfSeats = noOfSeats;
        }
        this.noOfEngines = noOfEngines;
        this.fuelCapacity = fuelCapacity;
        this.canTankOnAir = canTankOnAir;
    }

    public Plane() {
        this.name = "Boeing";
        this.noOfSeats = 400;
        this.noOfEngines = 4;
        this.fuelCapacity = 4000;
        this.canTankOnAir = false;
    }

    public Plane(String name, int noOfSeats, int fuelCapacity) {
        this(name, noOfSeats, 2, fuelCapacity, false);
    }

    public static double puntToKg(double puntFuel) {
        return calculator * puntFuel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println("Taking off");
    }

    public void land() {
        System.out.println("Landing" + calculator);
    }
    public void tankGas(double kg){
        Conventer conventer=new Conventer();
        this.fuelCapacity=new Conventer().convertKgtoLbs(kg);
    }

}

