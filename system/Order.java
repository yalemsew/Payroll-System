package payroll.system;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private String orderNo;
    private LocalDate orderDate;
    private double orderAmount;
    Order(String orderNo,LocalDate orderDate,double orderAmount){
        this.orderNo=orderNo;
        this.orderDate=orderDate;
        this.orderAmount=orderAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String print() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderDate=" + orderDate +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
