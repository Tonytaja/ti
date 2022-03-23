package lesson8.inheritance;

public class Bike extends Vehicle {


    public Bike(String manufacturer, int noOfDoors, int noOfWheels, int noOfSeats) {
        super(manufacturer,noOfDoors,noOfWheels,noOfSeats);
        super.move();

    }


}
