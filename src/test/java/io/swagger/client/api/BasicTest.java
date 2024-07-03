package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.TemporalAccessor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class BasicTest {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern ( "yyyy-MM-dd" );
        String date = "2024-01-21";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date, formatter1);
        System.out.println(offsetDateTime);

    }
    public static void three(){
        String dateStr = "2024-01-21";
        String dateStr2 = dateStr  + "T00:00:00+00:00";
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        // Parse to LocalDate and then convert to OffsetDateTime
        OffsetDateTime dateTime = OffsetDateTime.parse(dateStr2, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("Parsed date and time: " + dateTime);
        System.out.println(fun(dateTime));
    }
    private static LocalDate fun(OffsetDateTime offsetDateTime){
        System.out.println(offsetDateTime.getYear());
        System.out.println(offsetDateTime.getMonth());
        System.out.println(offsetDateTime.getDayOfMonth());
        return LocalDate.of(offsetDateTime.getYear(),offsetDateTime.getMonthValue(),offsetDateTime.getDayOfMonth());
    }
}
