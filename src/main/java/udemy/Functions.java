package udemy;

public class Functions {
//   static int f(int a, int b){
//        //logic
//        if (a>b)
//            return a;
//        else
//            return b;
//    }
    static void print(int b[]){
        System.out.println("Elements in the array");
        for (int ele:b){
            System.out.println(ele);
        }
    }
    static void setZero(int b[]){
        for (int i =0; i < b.length;i++){
            b[i]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
//        int x= f (10,20);
//        System.out.println(x);
        print(arr);
        setZero(arr);
        System.out.println("break line");
        print(arr);
    }
}
