package udemy;

public class Loops {
    public static void main(String[] args) {
        int i =1;
        while (i<=10){
            System.out.println("hello!!");
            i++;
        }
        i =10;
        do {
            System.out.println("runs once");
            i++;
        }while (i<5);

        for(int x=1; x<=10; x++){
            System.out.println("it is for....");
        }
    }
}
