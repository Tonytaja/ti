package lesson2;

public class SwitchMethods {
    public static void main(String[] args) {
        int someValue = 20;
        if (someValue == 10) {
            System.out.println("Value is 10");
        } else if (someValue == 20) {
            System.out.println("Value is 20");
        } else if (someValue == 30) {
            System.out.println("Value =30");
        } else {
            System.out.println("Value is different");
        }

        switch (someValue){
            case 1,2,3,4,5,6,7,8,9:
                System.out.println("value is lower than 10");
                break;
            case 10:
                System.out.println("value is 10");
                break;
            case 20:
                System.out.println("value is 20");
                break;
            case 30:
                System.out.println("value is 30");
                break;
            case 40:
                System.out.println("value is 40");
                break;
            default:
                System.out.println("value is different than 10 ,20 ,30 or 40");
        }
        String switchResult;

        switchResult=switch (someValue){
            case 10->"value is 10";
            case 20->"value is 20";
            case 30->"value is 30";
            case 40->"value is 40";
            default-> "value is different than 10 ,20 ,30 or 40";
        };
    }
}
