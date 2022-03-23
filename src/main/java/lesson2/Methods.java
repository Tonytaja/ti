package lesson2;

public class Methods {
    public static void methodName(){

    }
    public static int intMethodName(){
        int value =10;
        return value;
    }
    public static void  methodWithParameters(int a, int b){
        System.out.println("Parametr a"+ a);
        System.out.println("Parametr b" + b);
    }
    public static void  methodWithParameters(int a, int b,int c) {
        System.out.println("Parametr a" + a);
        System.out.println("Parametr b" + b);
        System.out.println("Parametr c" + c);
        System.out.println(String.format("Parameter c: %s %s %s",a,b,c));
    }

    public static void main(String[] args) {
        methodWithParameters(2,5);
        var methodResult = intMethodName();
        System.out.println();

    }
}
