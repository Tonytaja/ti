package lesson15.interfaceFuncional;

public class Subtract implements Operations {
    @Override
    public double calculate(double a, double b){
        return a-b;
    }
}
