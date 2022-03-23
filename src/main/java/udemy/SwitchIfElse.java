package udemy;

public class SwitchIfElse {
    public static void main(String[] args) {
        int a=10, b=20;
        if (a>b){
            System.out.println("a is bigger");
        }else if(b>a) {
            System.out.println("B is bigger");
        }else {
            System.out.println("B is equal to A");
        }
        int day=1;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            default:
                System.out.println("eeee");
        }
    }
}
