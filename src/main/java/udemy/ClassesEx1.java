package udemy;

class Sample{
    //data
    int x;
    //operators
    void set(int value){
        x=value;
    }
    int get(){return x;}
}

public class ClassesEx1 {
    public static void main(String[] args) {
        int a,b,c;
        Sample s1= new Sample();
        s1.set(121);
        System.out.println(s1.get());

    }
}
