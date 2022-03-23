package lesson14.figures;

public class Triangle extends Figure {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double calculateTheField(){
        return (0.5*a)*h;

    }
}
