package services;

import entity.Employee;

public interface AddEmployeeService {
    public default void addEmloyee(Employee employee){};
}
