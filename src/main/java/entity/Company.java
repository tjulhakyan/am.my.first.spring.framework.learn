package entity;

import java.util.List;

public class Company {
    List<Employee> emps;

    public Company(List<Employee> emps) {
        this.emps = emps;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }
}
