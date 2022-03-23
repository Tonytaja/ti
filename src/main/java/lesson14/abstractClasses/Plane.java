package lesson14.abstractClasses;



public class Plane extends Vehicle {

    private int noOfWings;


    public Plane(String manufacturer, int noOfDoors, int noOfWheels, int noOfWings, int noOfSeats) {
        super(manufacturer,noOfDoors,noOfWheels,noOfSeats);
        this.noOfWings=noOfWings;

    }


    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void parkInGarage() {

    }
}
