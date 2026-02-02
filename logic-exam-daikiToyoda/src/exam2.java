import java.time.LocalDateTime;

public class exam2 {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        int second = 59;
        
        LocalDateTime time = LocalDateTime.of(2025, 1, 1, hour, minute, second);
        
        LocalDateTime nextTime = time.plusSeconds(1);
        
        System.out.println("==================");
        System.out.println(hour + " 時 " + minute + " 分 " + second + " 秒の 1 秒後は " + nextTime.getHour() + " 時 " + nextTime.getMinute() + " 分 "  + nextTime.getSecond() + " 秒です");
        System.out.println("==================");
    }
}
