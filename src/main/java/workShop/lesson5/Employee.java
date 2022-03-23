package workShop.lesson5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    public static boolean nextID;
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    private static int nextId= 1;

    public Employee(String name, int salary, int y, int m, int d){
        this.name=name;
        this.salary=salary;
        this.hireDay=LocalDate.of (y,m,d);
        id= nextId++;

    }
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.now();
        this.id=nextId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.mm.yyyy");
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise= salary * byPercent/100;
        salary=raise;
    }
    public boolean equals(Employee employee){

        return this.name.equals(employee.name);
    }
}
