package payroll.system;

import human.resource.application.Employees;

public class Salaried extends Employee {
    private double salaries;
    Salaried(String empID,String name,double salaries){
        super(empID,name);
        this.salaries=salaries;
    }
    @Override
    public double calcGross(DateRange dateRange) {
        return salaries/12;
    }
}
