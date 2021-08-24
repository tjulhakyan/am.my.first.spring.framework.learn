package services;

import entity.Employee;

import java.util.List;

public class AddEmployeeServiceImp implements AddEmployeeService {
    List<Employee> emps;

    @Override
    public void addEmloyee(Employee employee) {
        emps.add(employee);
    }
}
