package lesson8.composition;

public class Body {


    private int noOfDoors;
    private int noOfWheels;
    private String bodyStyle;
    private boolean openRoof;

    public Body(int noOfDoors, int noOfWheels, String bodyStyle, boolean openRoof) {
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.bodyStyle = bodyStyle;
        this.openRoof = openRoof;
    }
    public void closeDoors(){
        System.out.println("Doors closed");
    }
    public void openDoors(){
        System.out.println("Doors open");
    }
    public void closeRoof(){
        System.out.println("Roof closed");
    }
    public void openRoof(){
        System.out.println("Roof open");
    }
    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public boolean isOpenRoof() {
        return openRoof;
    }
}
