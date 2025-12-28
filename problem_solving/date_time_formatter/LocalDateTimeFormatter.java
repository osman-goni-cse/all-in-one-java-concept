package problem_solving.date_time_formatter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LocalDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current time is: " + formattedDateTime);
    }
}
