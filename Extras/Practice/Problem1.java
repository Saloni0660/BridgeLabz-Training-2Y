import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Problem1 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss z");

        ZonedDateTime currentTime = ZonedDateTime.now();

        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(ZoneId.of("GMT"));
        ZonedDateTime istTime = currentTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = currentTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT : " + formatter.format(gmtTime));
        System.out.println("Current Time in IST : " + formatter.format(istTime));
        System.out.println("Current Time in PST : " + formatter.format(pstTime));
    }
}
