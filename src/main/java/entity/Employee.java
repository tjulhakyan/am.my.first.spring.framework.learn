package entity;

import services.CalculateSalaryServiceImp;

public class Employee {
    private Integer level;
    private Computer computer;
    private CalculateSalaryServiceImp salary;

    public Employee(Integer level, Computer computer, CalculateSalaryServiceImp salary) {
        this.level = level;
        this.computer = computer;
        this.salary = salary;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public CalculateSalaryServiceImp getSalary() {
        return salary;
    }

    public void setSalary(CalculateSalaryServiceImp salary) {
        this.salary = salary;
    }
}
