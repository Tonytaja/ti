package workShop.lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) throws FileNotFoundException {

        File data = new File("C:\\Users\\Tomasz\\IdeaProjects\\ti\\src\\main\\java\\workShop\\test");
        Scanner scanner= new Scanner(System.in);
        Employee[] employees=new Employee[4];
        int i =0;
        System.out.println(Employee.nextID);
        while (scanner.hasNext()){
            String name= scanner.next() + scanner.next();
            int salary= scanner.nextInt();
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();

            employees[i++]= new Employee(name,salary,year,month,day);
        }

        Employee emp=new Employee("Tony Stark",2000,2022,12,12);
        Manager boss= new Manager("Thic",23412);
        boss.setBonus(232.12);
        System.out.println(boss.getBonus(22));

        for (int j=0; j< employees.length;j++){
            employees[j].raiseSalary(5);
            System.out.println(employees[j].getSalary()+"PLN");
        }
        employees[3]=emp;
        System.out.println(employees[3]==emp);



    }
}
