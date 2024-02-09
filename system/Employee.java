package payroll.system;

import human.resource.application.Employees;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    private String empID;
    private String name;
    private Paycheck paycheck=null;
//    private List<Paycheck> listOfPaycheck=new ArrayList<>();

    public Employee(String empId, String name) {
        this.empID=empId;
        this.name=name;
    }


    public Paycheck calcCompensation(DateRange dateRange){
        double grossPay=calcGross(dateRange);

//        listOfPaycheck.add(paycheck);
        return new Paycheck(grossPay,dateRange,this);
    }

    public String print() {
        return
                " EmpID = " + empID + "\n" +
                " Name = " + name + "\n";
    }

    public abstract double calcGross(DateRange dateRange);
}
