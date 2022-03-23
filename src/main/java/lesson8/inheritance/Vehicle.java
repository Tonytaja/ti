package lesson8.inheritance;

public class Vehicle {
     String manufacturer;
     int noOfDoors;
     int noOfWheels;
     int noOfSeats;

    public Vehicle(String manufacturer, int noOfDoors, int noOfWheels, int noOfSeats) {
        this.manufacturer = manufacturer;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
    }

    public  void move(){
        System.out.println("move");

     }
     public void stop(){
         System.out.println("Stop");

     }
}
