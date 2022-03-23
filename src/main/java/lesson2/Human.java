package lesson2;

public class Human {

    double height =1.68;
    String skinColour="white";
    boolean gender=true;
    int age=25;

    public void walk(){
        System.out.println("I can walk");
        makeAStep();
    }
    public void increaseAge(){
        age = age+1;
        System.out.println(age);
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSkinColour(String skinColour){
        this.skinColour=skinColour;
    }
    public int getAge(){
        return age;
    }
    private void makeAStep(){
        System.out.println("I am making a step");
    }


}
