package lesson14.figures;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double calculateTheField(){
        return a*a;

    }
}
