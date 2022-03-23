package lesson7;

public class HumanWithConstructor {
    private double height ;
    private String skinColour;
    private boolean gender=true;
    private int age;
    private double weight = 80;

    public HumanWithConstructor(double height, String skinColour, int age, double weight){
        this.height=height;
        this.skinColour=skinColour;
        this.age=age;
        this.weight=weight;
    }
    public HumanWithConstructor(double height, String skinColour, int age, boolean gender){
        this.height=height;
        this.skinColour=skinColour;
        this.age=age;
        this.gender=false;
    }

    public HumanWithConstructor(){
        this.height= 1.66;
        this.skinColour="white";
        this.age=29;
        this.weight=85;
     //   or
      //  this(1.66,"white",29,88);
    }

    public void walk(){
        System.out.println("I can walk");
        makeAStep();
    }
    public void increaseAge(){
        age = age+1;
        System.out.println(age);
    }
    public void setAge(int age){
        if (age>0 && age<150 ) {
            this.age = age;
        }else {
            System.out.println("You are too old to be alive ");
        }
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
