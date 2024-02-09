package payroll.system;

import java.time.LocalDate;
import java.util.Date;

public class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;
    DateRange(LocalDate startDate,LocalDate endDate){
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public boolean isInRange(LocalDate checkDate){
        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }
    public static int getFirstDayOfMonth(Date date){
        return 2;
    }
    public static int getLastDayOfMonth(Date date){
        return 28;
    }

    @Override
    public String toString() {
        return "\n"+" Date Range:" +
                " startDate=" + startDate +" To "+
                " endDate=" + endDate;
    }
}
