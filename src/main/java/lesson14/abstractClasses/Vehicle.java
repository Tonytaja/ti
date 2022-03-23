package lesson14.abstractClasses;

public abstract class Vehicle extends MovingObject {
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

    public abstract void move();
     public abstract void stop();
     public abstract void parkInGarage();
    public  void methodFromMovingObject(){};

    public String getManufacturer(){return manufacturer;}
    public int getNoOfDoors(){return noOfDoors;}
    public int getNoOfWheels(){return noOfWheels;}
    public int getNoOfSeats(){return noOfSeats;}
}
