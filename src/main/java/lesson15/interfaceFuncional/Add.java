package lesson15.interfaceFuncional;

public class Add implements Operations{
    @Override
    public double calculate(double a, double b){
        return a+b;
    }
}
