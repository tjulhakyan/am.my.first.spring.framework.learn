package entity;

import services.CalculateSalaryServiceImp;

public class Director extends Employee {
    private Computer computerExtra;
    private Printer printer;

    public Director(Integer level, Computer computer, CalculateSalaryServiceImp salary, Computer computerExtra, Printer printer) {
        super(level, computer, salary);
        this.computerExtra=computerExtra;
        this.printer=printer;
    }

    public Computer getComputerExtra() {
        return computerExtra;
    }

    public void setComputerExtra(Computer computerExtra) {
        this.computerExtra = computerExtra;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
