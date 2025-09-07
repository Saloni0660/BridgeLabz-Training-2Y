import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem3 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Date in dd/MM/yyyy format   : " + today.format(format1));
        System.out.println("Date in yyyy-MM-dd format   : " + today.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy   : " + today.format(format3));
    }
}
