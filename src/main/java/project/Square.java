package project;

public class Square extends AreaField {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double calculateTheArea(){
        return a*a;

    }
}
