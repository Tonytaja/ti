package lesson15.interfaceFuncional;

public class Divide implements Operations{
    @Override
    public double calculate(double a, double b){
        return a/b;
    }
}
