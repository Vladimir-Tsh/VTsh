package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Calendar mydate = new GregorianCalendar();
        Calendar startdate = new GregorianCalendar();
        Date thedate = null;
        try {
            thedate = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        mydate.setTime(thedate);
        startdate.setTime(thedate);
        startdate.set(Calendar.DAY_OF_MONTH, 1);
        startdate.set(Calendar.MONTH, 0);
        long msTimeDistance = mydate.getTimeInMillis() - startdate.getTimeInMillis();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay)+1;
        //System.out.println(dayCount);
        return (boolean)(dayCount%2!=0);
    }
}
