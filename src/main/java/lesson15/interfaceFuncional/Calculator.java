package lesson15.interfaceFuncional;

public class Calculator {

    public double execute(double a, double b, Operations operations){
        return operations.calculate(a,b);

    }

}
