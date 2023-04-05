package com.example.backendcoretraining;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class DatesAndTimes {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2014, 3, 17);
        LocalDate ld3 = LocalDate.of(2022, Month.DECEMBER, 25);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);

        //invalid date
       // LocalDate invalidDate = LocalDate.of(2022, 14, 1);

        // times
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10, 5);
        System.out.println(lt1);
        System.out.println(lt2);

        // datetime
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2023, 4, 1, 2,3);
        LocalDateTime ltd3 = LocalDateTime.of(ld1, lt1);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ltd3);

        // monthday
        MonthDay monthDay = MonthDay.of(7, 8);
        LocalDate newLocalDate = monthDay.atYear(2022);

        // yearMonth
        YearMonth yearMonth = YearMonth.now();
        LocalDate localDate = yearMonth.atDay(8);
    }
}
