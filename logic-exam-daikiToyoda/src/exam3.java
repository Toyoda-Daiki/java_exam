import java.util.Scanner;

public class exam3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int year = (2001);

    int century = (year - 1) / 100 + 1;

    System.out.println("==================");
    System.out.println(year + "年は" + century + "世紀です");
    System.out.println("==================");

    scanner.close();
  }
}
