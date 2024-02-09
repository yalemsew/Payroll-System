package payroll.system;

import human.resource.application.Company;
import human.resource.application.Employees;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission=0.07;
    private double baseSalary=0;
    private List<Order> listOfOrder;
    Commissioned(String empID,String name,double baseSalary,List<Order> orderList){
        super(empID,name);
        this.baseSalary=baseSalary;
        this.listOfOrder=orderList;
    }


    @Override
    public double calcGross(DateRange dateRange) {
        double grossSalary=baseSalary;

        for (Order order : listOfOrder) {
            if (dateRange.isInRange(order.getOrderDate())) {
                grossSalary += order.getOrderAmount() * commission;
            }

        }
        return grossSalary;
    }

}
