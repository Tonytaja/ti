package lesson2;

public class CodeWithoutMethods {
    public static void main(String[] args) {
        var drinkingPrice = 3.2;
        var paidMoney = 1.0;
        var isSelected = false;
        if (paidMoney >=drinkingPrice) {
            System.out.println("Please take you beverage");
        } else {
            System.out.println("You have to pay " + (drinkingPrice - paidMoney));
        }

        paidMoney = 2;
        if (paidMoney >= drinkingPrice) {
            System.out.println("please take your drink");
        } else {
            System.out.println("You still have to pay " + (drinkingPrice - paidMoney));
        }

        paidMoney = 3.2;
        if (paidMoney >= drinkingPrice) {
            System.out.println("please take your drink");
        } else {
            System.out.println("You still have to pay " + (drinkingPrice - paidMoney));
        }

    }
}
