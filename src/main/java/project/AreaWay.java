package project;

public class AreaWay  {

Pick pick = new Pick();
Cylinder cylinder= new Cylinder();

public AreaWay(){
    pick= new Pick();
    cylinder= new Cylinder();
    pick.pickMethod();
}

    public static void main(String[] args) {
        new AreaWay();
    }

}
