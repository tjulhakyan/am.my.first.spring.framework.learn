package services;

import entity.Employee;

public interface CalculateSalaryService {
    public static CalculateSalaryServiceImp calculateSalary(Employee employee){
        Integer solary=employee.getLevel()*350*80/100;
        return new CalculateSalaryServiceImp(employee, solary);
    }
}
