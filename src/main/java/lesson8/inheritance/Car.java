package lesson8.inheritance;

public class Car extends Vehicle {

    private boolean openRoof;


    public Car(String manufacturer, int noOfDoors, int noOfWheels, boolean openRoof, int noOfSeats) {
        super(manufacturer,noOfDoors,noOfWheels,noOfSeats);
        this.openRoof=openRoof;
    }
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
}
