package workShop.lesson5;

public class Manager extends Employee {
    private String carModel;
    private double bonus;

    public Manager(String name, int salary, int y, int m, int d) {
        super(name, salary, y, m, d);
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public Manager setBonus(double bonus) {
        this.bonus = bonus;
        return this;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getBonus(double v) {
        return bonus;
    }
}
