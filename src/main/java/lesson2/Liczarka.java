package lesson2;

public class Liczarka {
    private double paidMoney;
    private double drinkPrice=2.5;
    private final int factor = 2;

    public void countMoney(double paidMoney, double drinkPrice) {
        checkIfPaidIsNotSmallerThanZero(paidMoney);
        if (paidMoney >= drinkPrice) {
            System.out.println("Please take your drink");
        } else {
            System.out.println("You have to pay  " + (factor * drinkPrice - paidMoney));
        }
    }

    public void countMoney(float paidMoney, float drinkPrice) {
        checkIfPaidIsNotSmallerThanZero(paidMoney);
        if (paidMoney >= drinkPrice) {
            System.out.println("Please take your drink");
        } else {
            System.out.println("You have to pay " + (drinkPrice - paidMoney));
        }
    }
    public void countMoney() {
        checkIfPaidIsNotSmallerThanZero(paidMoney);
        if (paidMoney >= drinkPrice) {
            System.out.println("Please take your drink");
        } else {
            System.out.println("You have to pay " + (drinkPrice - paidMoney));
        }
    }
    private boolean checkIfPaidIsNotSmallerThanZero(double paidMoney){
        if (paidMoney<0){
            return true;
        }else {
            return false;
        }
    }
    int secretCounting(int factor){
        int result= secretCounting(factor);
        return result;
    }

    private int superSecretCounting(int abc){
        var factor1=312;
        var factor2=222;
        int result;

        if(abc>10){
            result =abc*factor1*factor2;
        }else {

            result =abc-123;
        }
        return result;
    }
    public int getFactor(){return factor;}
}
