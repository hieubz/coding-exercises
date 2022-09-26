package core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTest {

  public static void main(String[] args) {
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now().minusDays(1).minusWeeks(2);
    Period p = Period.between(startDate, endDate); // use year, month, day to represent a period of time
    System.out.println(p);


    LocalTime start = LocalTime.now();
    LocalTime end = LocalTime.of(20, 10, 2);
    System.out.println(Duration.between(start, end).getSeconds());
  }
}
