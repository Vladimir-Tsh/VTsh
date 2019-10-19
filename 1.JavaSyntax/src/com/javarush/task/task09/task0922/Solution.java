package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat sdfStrOld = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfStrNew = new SimpleDateFormat("MMM d, yyyy");

        String sDate = reader.readLine();
        try {
            Date dStr = sdfStrOld.parse(sDate);
            sDate = sdfStrNew.format(dStr);
            System.out.println(sDate.toUpperCase());
        }
        catch (ParseException e) {
            System.out.println("Дата не по формату yyyy-MM-dd.");
            System.out.println(e.getMessage());
        }

        /*DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH);
        String sDate = reader.readLine();
        try {
            LocalDate dStr = LocalDate.parse(sDate, formatterIn);
            sDate = dStr.format(formatterOut);
            System.out.println(sDate.toUpperCase());
        }
        catch (DateTimeParseException e){
            System.out.println(e.getMessage());
        }*/
    }
}
