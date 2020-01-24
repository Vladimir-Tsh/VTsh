package ru.sbrf.schvv.springboottest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Today {
    private String value;

    private Date dateNow = new Date();

    public Today(String format) {
        DateFormat dfTime = new SimpleDateFormat(format, Locale.getDefault());
        this.value = dfTime.format(dateNow);
    }

//    public Today(String formatDate, String formatTime) {
//        DateFormat dfDate = new SimpleDateFormat(formatDate, Locale.getDefault());
//        DateFormat dfTime = new SimpleDateFormat(formatTime, Locale.getDefault());
//        this.date = dfDate.format(dateNow);
//        this.time = dfTime.format(dateNow);
//    }

    public String getValue() {
        return value;
    }

    public Date getDateNow() {
        return dateNow;
    }
}
