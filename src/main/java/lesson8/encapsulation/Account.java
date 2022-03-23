package lesson8.encapsulation;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double initialBalance){
        this.name=name;

        if (initialBalance < 0){
            System.out.println("Error - Initial balance need to be higher than 0");
        }else {
            this.balance=initialBalance;
        }
    }
    public void withdraw(double amountToWithdraw){
        if (balance-amountToWithdraw >=0){
            System.out.println("Please collect your money");
            balance -= amountToWithdraw;
        }else {
            System.out.println("Error! Your balance is less than you want withdraw. Please change amount and try again");
        }
    }
    public void deposit(double amountToDeposit){
        if (amountToDeposit <=0){
            System.out.println("Error! Wrong amount to deposit. Should be more than 0");
        }else {
            System.out.println("Money added to your balance");
            balance += amountToDeposit;
        }
    }
    public String getName(){return name;}
    public double getBalance(){return balance;}
    public static Account createAccount(){return new Account("test",23);}
}
