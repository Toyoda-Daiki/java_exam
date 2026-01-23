import java.time.LocalDate;

public class Exam5 {
  public static void main(String[] args) {
    LocalDate birthday = LocalDate.of(2001,06,15);
  
    int year = birthday.getYear();
    int day = birthday.getDayOfMonth();
    int month = birthday.getMonthValue();

    System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");
  }
}
