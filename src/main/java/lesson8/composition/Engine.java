package lesson8.composition;

public class Engine {

    private int horsePower;
    private int noOfCylinders;
    private int noOfGears;
    private boolean isDiesel;

    public Engine(int horsePower, int noOfCylinders, int noOfGears, boolean isDiesel) {
        this.horsePower = horsePower;
        this.noOfCylinders = noOfCylinders;
        this.noOfGears = noOfGears;
        this.isDiesel = isDiesel;
    }
    public void startEngine(){
        System.out.println("Engine Started");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped");
    }
    public int getHorsePower(){return horsePower;}
    public void setHorsePower(int horsePower){this.horsePower=horsePower;}
    public int getNoOfCylinders(){return noOfCylinders;}
    public void setNoOfCylinders(int noOfCylinders){this.noOfCylinders=noOfCylinders;}
    public int getNoOfGears(){return noOfGears;}
    public void setNoOfGears(int noOfGears){this.noOfGears=noOfGears;}
    public boolean isDiesel(){return  isDiesel;}
    public void setDiesel(boolean isDiesel){isDiesel=isDiesel;}


}
