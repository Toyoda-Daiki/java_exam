public class exam4 {
  public static void main(String[] args) {
    int year = 2100;

    System.out.println("==================");
    if (isLeapYear(year)) {
      System.out.println(year + "年はうるう年です");
    } else {
      System.out.println(year + "年はうるう年ではありません");
    }
    System.out.println("==================");
  }

  public static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    if (year % 4 == 0) {
      return true;
    }
    return false;
  }
}
