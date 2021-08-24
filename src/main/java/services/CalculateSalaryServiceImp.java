package services;

import entity.Employee;

public class CalculateSalaryServiceImp implements CalculateSalaryService {
    private Employee employee;
    private Integer solary;


    public CalculateSalaryServiceImp(Employee employee, Integer solary) {
        this.employee = employee;
        this.solary = solary;
    }

    public static CalculateSalaryServiceImp calculateSalary(Employee empmloyee) {
        Integer solary=empmloyee.getLevel()*350*80/100;
        return new CalculateSalaryServiceImp(empmloyee, solary);
    }

    public Employee getEmpmloyee() {
        return employee;
    }

    public void setEmpmloyee(Employee empmloyee) {
        this.employee = empmloyee;
    }

    public Integer getSolary() {
        return solary;
    }

    public void setSolary(Integer solary) {
        this.solary = solary;
    }
}
