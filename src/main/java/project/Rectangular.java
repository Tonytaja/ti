package project;

public class Rectangular extends Volume {
    private double length;
    private double width;
    private double height;
    public Rectangular(double length, double width, double height){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateTheVolume() {
        return length*height*width;
    }
}
