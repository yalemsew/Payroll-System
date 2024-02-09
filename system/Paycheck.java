package payroll.system;

public class Paycheck {
    private double grossPay;
    private double fica=0.23;
    private double state=0.05;
    private double local=0.01;
    private double medical=0.03;
    private double socialSecurity=0.075;
    private DateRange payPeriod;
    private Employee employee;
    Paycheck(double grossPay,DateRange  payPeriod,Employee employee){
        this.grossPay=grossPay;
        this.payPeriod=payPeriod;
        this.employee=employee;
    }
    public double getNetPay(){
        fica=grossPay*0.23;
        state=grossPay*0.05;
        local=grossPay*0.01;
        medical=grossPay*0.03;
        socialSecurity=grossPay*0.075;
        return grossPay-(fica+state+local+medical+socialSecurity);
    }


    public String print() {
        double netPay=getNetPay();
        return  "Employee: "+"\n" +employee.print()+"\n"+
                "Paycheck:" +"\n"+
                " grossPay = " + String.format("%.2f", state) +"\n"+
                " fica = " + String.format("%.2f", state) +"\n"+
                " state = " + String.format("%.2f", state) +"\n"+
                " local = " + String.format("%.2f", local)+"\n"+
                " medical = " + String.format("%.2f", medical) +"\n"+
                " socialSecurity = " + String.format("%.2f", socialSecurity) +"\n"+
                " Net Pay = "+String.format("%.2f", netPay)+
                payPeriod+"\n\n";
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedical() {
        return medical;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public DateRange getPayPeriod() {
        return payPeriod;
    }
}
