package project;

        import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;
        import java.util.Scanner;


public class Calculator extends JFrame  {
    private Volume volume;
    private AreaField areaField;
    private Circle circle;
    private Cube cube;
    private Rectangular rectangular;
    private  Pick pick;
    private Menu menu= new Menu();

    public Calculator(){
        pick=new Pick();

        pick.pickMethod();

    }
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to count area or volume of the figure ");
        System.out.println("1. Area ");
        System.out.println("2. Volume ");
        System.out.println("3.Pick's theorem");
        int v = scanner.nextInt();
        switch (v) {
            case 1:
                System.out.println("You picked area");
                break;
            case 2:
                System.out.println("You picked volume");
                break;
            case 3:
                System.out.println("Hi welcome to polygon area calculator !! ");
                new Calculator().pick.pickMethod();
                break;
            default:
                System.out.println("Wrong number");
        }

        if (v == 1) {
            Menu menu = new Menu();
            menu.menu1();
        } else if (v == 2) {
            Menu menu = new Menu();
            menu.menu2();
        }
        int f = scanner.nextInt();
        if (v == 1) {
            switch (f) {
                case 1:
                    System.out.println("Enter the radius of the circle :");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.print("The area = " + circle.calculateTheArea());
                    break;
                case 2:
                    System.out.println("Enter the side of the square");
                    double a = scanner.nextDouble();
                    Square square = new Square(a);
                    System.out.println("The area = " + square.calculateTheArea());
                    break;
                case 3:
                    System.out.println("Enter the base of the triangle");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle");
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("The area = " + triangle.calculateTheArea());
                    break;
                default:
                    System.out.println("Wrong value");
                    break;
            }
        } else if (v == 2) {
            switch (f) {
                case 1:
                    System.out.println("Enter the value: ");
                    double edge = scanner.nextDouble();
                    Cube cube = new Cube(edge);
                    System.out.println("The volume = " + cube.calculateTheVolume());
                    break;
                case 2:
                    System.out.println("Enter the length");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the width");
                    double width = scanner.nextDouble();
                    System.out.println("Enter the height");
                    double height = scanner.nextDouble();
                    Rectangular rectangular = new Rectangular(length, width, height);
                    System.out.println("The volume = " + rectangular.calculateTheVolume());
                    break;
                case 3:
                    System.out.println("Enter the radius");
                    double radius = scanner.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    System.out.println("The volume = " + sphere.calculateTheVolume());
                    break;
                case 4:
                    System.out.println("Enter the radius");
                    double baseRadius = scanner.nextDouble();
                    System.out.println("Enter the height ");
                    double heiight = scanner.nextDouble();
                    Cone cone = new Cone(baseRadius, heiight);
                    System.out.println("The volume = " + cone.calculateTheVolume());
                    break;
                case 5:
                    System.out.println("Enter the radius");
                    double radi = scanner.nextDouble();
                    System.out.println("Enter the height");
                    double high = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radi, high);
                    System.out.println("The volume = " + cylinder.calculateTheVolume());
                    break;
                default:
                    System.out.println("Wrong value");
                    break;
            }

        }
    }
}
