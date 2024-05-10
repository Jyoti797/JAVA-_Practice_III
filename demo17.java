import java.time.*;

public class demo17{
    public static void main(String[] args) {
        LocalDate tarikh = LocalDate.now();
        // System.out.println(tarikh);

        int day = tarikh.getDayOfMonth();
        int month = tarikh.getMonthValue();
        int year = tarikh.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime samay = LocalTime.now();
        int hour = samay.getHour();
        int minute = samay.getMinute();
        int seconds = samay.getSecond();

        System.out.println(hour + ":" + minute + ":" + seconds);


    }
}