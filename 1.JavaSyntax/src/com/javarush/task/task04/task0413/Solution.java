package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] week = new String[7];
        week[0] = "понедельник";
        week[1] = "вторник";
        week[2] = "среда";
        week[3] = "четверг";
        week[4] = "пятница";
        week[5] = "суббота";
        week[6] = "воскресенье";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDay = reader.readLine();
        int nDay = Integer.parseInt(sDay);

        if (nDay >=1 && nDay <= 7)
            System.out.println(week[nDay - 1]);
        else
            System.out.println("такого дня недели не существует");
    }
}