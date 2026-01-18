// How will you get the current date and time using Java 8 Date and Time API?

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class getCurrentDateTime {
    public static void main(String[] args)
    {
        System.out.print(LocalDate.now() +"\n"+LocalTime.now()+"\n"+LocalDateTime.now());
    }
}
