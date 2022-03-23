package lesson2;

public class InstrukcjaIF {
    public static void main(String[] args) {
        boolean isSkyBlue=true;
        if(isSkyBlue){
            System.out.println("Let's go for a walk");
        }
        int temperature =25;
        if (temperature>20){
            System.out.println("It is a good weather");
        }
        if (temperature<20 || temperature >10){
            System.out.println("good weather but to cold for swimming");
        }
        boolean goodWeather = true;
        int moneyInBank=100;
        if (goodWeather && moneyInBank >=100){
            System.out.println("We are going for trip");
        } else if(moneyInBank>50) {
            System.out.println("We can buy ice cream");
        }  else
         {
            System.out.println("We are staying at home ");
        }

    }
}
