package com.javarush.task.task19.task1921;

import sun.util.calendar.BaseCalendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        String file = args[0];

        Pattern patternBirthDate = Pattern.compile("\\d+\\s\\d+\\s\\d{4}");
        Matcher matcher;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));

            String line;
            while (fileReader.ready()) {
                line = fileReader.readLine();
                matcher = patternBirthDate.matcher(line);
//                System.out.println(line);
                matcher.find();
//                System.out.println(line.substring(0, matcher.start() - 1));
//                System.out.println(stringToDate(matcher.group()));
                PEOPLE.add(new Person(line.substring(0, matcher.start() - 1), stringToDate(matcher.group())));
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Что-то с файлом... " + e.getMessage());
        }
    }

    public static Date stringToDate(String s) {
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("d M yyyy");
        try {
            date = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
