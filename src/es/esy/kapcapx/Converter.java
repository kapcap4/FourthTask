package es.esy.kapcapx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Converter {
    public final String DEFAULT_PATTERN = "dd.MM.yyyy";
    private int lastMethod;

    public String convert (long time) {
        lastMethod = 0;
        String dateString;
        Date date = new Date(time);
        dateString = date.toString();
        return dateString;
    }
    public String convert (long time, String pattern) {
        lastMethod = 1;
        String dateString;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        dateString = simpleDateFormat.format( new Date(time) );
        return dateString;
    }
    public String convert (int year, int month, int day) {
        lastMethod = 2;
        String dateString;
        dateString = (year + "." + month + "." + day);
        return dateString;
    }
    public String convert (int year) {
        lastMethod = 3;
        String intercalaryYear;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        intercalaryYear = (gregorianCalendar.isLeapYear(year)) ? "Високосный" : "Невисокосный";
        return intercalaryYear;
    }
    public long convert (String time, String pattern) throws ParseException {
        lastMethod = 4;
        long dateLong;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time);
        dateLong = date.getTime();
        return dateLong;
    }

    public int getLastMethod() {
        return lastMethod;
    }
}
