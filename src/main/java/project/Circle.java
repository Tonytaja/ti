package project;

public class Circle extends AreaField {
    private double radius;
    private final double PI=3.14;

    public  Circle(double radius)
    {

        this.radius = radius;

    }

    @Override
    public double calculateTheArea() {
        return PI*radius*radius;
    }
}

