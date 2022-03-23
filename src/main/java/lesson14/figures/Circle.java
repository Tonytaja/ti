package lesson14.figures;

public class Circle  extends Figure{
    private double r;
    private final double PI=3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateTheField(){
        return PI*r*r;

    }
}
