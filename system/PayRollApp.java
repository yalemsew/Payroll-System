package payroll.system;

import human.resource.application.Employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayRollApp {
    public static void main(String[] args) {
        Order laptopOrder = new Order("12345", LocalDate.of(2022, 1, 15), 1500.00);
        Order bookOrder = new Order("67890", LocalDate.of(2022, 2, 20), 0.50);
        Order gadgetOrder = new Order("13579", LocalDate.of(2022, 2, 10), 300.25);
        Order clothingOrder = new Order("24680", LocalDate.of(2022, 4, 5), 200.75);
        Order furnitureOrder = new Order("11223", LocalDate.of(2022, 4, 12), 900.50);
        Order electronicsOrder = new Order("33445", LocalDate.of(2022, 4, 20), 600.25);
        Order applianceOrder = new Order("55667", LocalDate.of(2022, 8, 3), 1200.30);
        Order jewelryOrder = new Order("77889", LocalDate.of(2022, 8, 18), 150.75);
        Order toyOrder = new Order("99001", LocalDate.of(2022, 8, 7), 80.90);
        List<Order> orderList = new ArrayList<>();
        orderList.add(laptopOrder);
        orderList.add(bookOrder);
        orderList.add(gadgetOrder);
        orderList.add(clothingOrder);
        orderList.add(furnitureOrder);
        orderList.add(electronicsOrder);
        orderList.add(applianceOrder);
        orderList.add(jewelryOrder);
        orderList.add(toyOrder);

        DateRange januaryRange = new DateRange(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 31));
        DateRange februaryRange = new DateRange(LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 28));
//        DateRange marchRange = new DateRange(LocalDate.of(2022, 3, 1), LocalDate.of(2022, 3, 31));
        DateRange aprilRange = new DateRange(LocalDate.of(2022, 4, 1), LocalDate.of(2022, 4, 30));
        DateRange mayRange = new DateRange(LocalDate.of(2022, 5, 1), LocalDate.of(2022, 5, 31));
        DateRange juneRange = new DateRange(LocalDate.of(2022, 6, 1), LocalDate.of(2022, 6, 30));
        DateRange julyRange = new DateRange(LocalDate.of(2022, 7, 1), LocalDate.of(2022, 7, 31));
        DateRange augustRange = new DateRange(LocalDate.of(2022, 8, 1), LocalDate.of(2022, 8, 31));
        DateRange septemberRange = new DateRange(LocalDate.of(2022, 9, 1), LocalDate.of(2022, 9, 30));

        Employee janeSmith = new Salaried("E002", "Jane Smith", 55000.00);
        System.out.println(janeSmith.calcCompensation(januaryRange).print());


        Employee davidWilson = new Commissioned("E104", "David Wilson", 6000.00,orderList);
        System.out.println(davidWilson.calcCompensation(februaryRange).print());

        Employee robertMiller = new Hourly("E202", "Robert Miller", 22.75, 35.5);


    }
}
