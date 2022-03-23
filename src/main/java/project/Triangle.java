package project;

public class Triangle extends AreaField {
    private double height;
    private double base;
    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double calculateTheArea(){
        return (0.5*base)*height;

    }
}
