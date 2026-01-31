package com.functionalinterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormat {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(DateUtils.formatDate(today, "dd-MM-yyyy"));
    }
}
