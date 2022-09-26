package core;

public class SwitchCaseTest {

  public static String getWeekDay(int day) {
    String weekDay = "";
    switch (day) {
      case 1:
        weekDay = "SUNDAY";
        break;
      case 2:
        weekDay = "MONDAY";
        break;
      case 3:
        weekDay = "TUESDAY";
        break;
      case 4:
        weekDay = "WEDNESDAY";
        break;
      default:
        // there is no case match
        weekDay = "UNKNOWN";
    }
    return weekDay;
  }

  public static void main(String[] args) {
    System.out.println(getWeekDay(13));
  }
}
