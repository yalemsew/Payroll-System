package payroll.system;

import human.resource.application.Employees;

public class Hourly extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;
    Hourly(String empId,String name,double hourlyWage,double hoursPerWeek){
        super(empId,name);
        this.hourlyWage=hourlyWage;
        this.hoursPerWeek=hoursPerWeek;
    }

    @Override
    public double calcGross(DateRange dateRange) {
        return hourlyWage*hoursPerWeek*4;
    }
}
