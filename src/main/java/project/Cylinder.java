package project;

public class Cylinder extends Volume{
    private double radius;
    private  double height;
    private final double PI=3.14285714286;
    public Cylinder(double radius, double height){
        this.height=height;
        this.radius=radius;

    }

    public Cylinder() {

    }

    @Override
    public double calculateTheVolume() {
        return PI*Math.pow(radius,2)*3;
    }
}