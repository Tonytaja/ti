package project;

public class Sphere extends Volume{

    private double radius;
    private final double PI=3.14285714286;
    public Sphere(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateTheVolume() {
        double div= (double) 4/3;
        return PI *div * Math.pow(radius,3);
    }
}

