package lesson7;

public class Loops {
    public static void main(String[] args) {
        for (int i =1; i<10;i++){
            System.out.println(i);

        }
        boolean flag = true;
        int whileIterator = 0;
        while (whileIterator != 5){
            System.out.println("Iterator value is " + whileIterator);
            whileIterator++;

        }
        whileIterator=0;
        do {
            System.out.println("1234");
        }while (whileIterator>0);
    }
}
