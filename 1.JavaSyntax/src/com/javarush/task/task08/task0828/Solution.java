package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<Integer, String> monthMap = new HashMap<Integer, String>();
        /*monthMap.put(1, "JANUARY");
        monthMap.put(2, "FEBRUARY");
        monthMap.put(3, "MARCH");
        monthMap.put(4, "APRIL");
        monthMap.put(5, "MAY");
        monthMap.put(6, "JUNE");
        monthMap.put(7, "JULY");
        monthMap.put(8, "AUGUST");
        monthMap.put(9, "SEPTEMBER");
        monthMap.put(10, "OCTOBER");
        monthMap.put(11, "NOVEMBER");
        monthMap.put(12, "DECEMBER");*/
        Calendar mydate = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        for (int i = 0; i < 12; i++) {
            mydate.set(Calendar.MONTH, i);
            monthMap.put(i + 1, dateFormat.format(mydate.getTime()));
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ind = 1;
        //Set<Map.Entry<Integer, String>> entrySet = monthMap.entrySet();
        for (Map.Entry<Integer, String> pair : monthMap.entrySet())
            if (s.equals(pair.getValue()))
                ind = pair.getKey();// нашли наше значение и возвращаем  ключ
        System.out.println(s + " is the " + ind + " month");
    }
}
