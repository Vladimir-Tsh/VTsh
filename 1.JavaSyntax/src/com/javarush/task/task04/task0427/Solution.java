package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();

        int nA = 0;

        try {
            nA = Integer.parseInt(sA);
        } catch (Exception e){
            //System.err.println(e);
            System.out.println("Ведите целое число");
            System.exit(0);
            //return;
        }

        if (nA > 0 && nA < 1000){
            int l = sA.length();
            boolean c = (nA / 2 * 2 == nA);
            if (c)
                switch (l){
                    case 1: System.out.println("четное однозначное число"); break;
                    case 2: System.out.println("четное двузначное число"); break;
                    case 3: System.out.println("четное трехзначное число"); break;
                }
             else
                switch (l){
                    case 1: System.out.println("нечетное однозначное число"); break;
                    case 2: System.out.println("нечетное двузначное число"); break;
                    case 3: System.out.println("нечетное трехзначное число"); break;
                }
        }
    }
}