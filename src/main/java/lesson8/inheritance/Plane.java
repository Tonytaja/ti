package lesson8.inheritance;

public class Plane extends Vehicle{

    private int noOfWings;


    public Plane(String manufacturer, int noOfDoors, int noOfWheels, int noOfWings, int noOfSeats) {
        super(manufacturer,noOfDoors,noOfWheels,noOfSeats);
        this.noOfWings=noOfWings;

    }


}
