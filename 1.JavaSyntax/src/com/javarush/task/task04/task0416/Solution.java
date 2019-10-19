package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sMin = reader.readLine();

        float nMin = 0;

        try {
            nMin = Float.parseFloat(sMin);

            if (nMin < 0 || nMin >= 60) throw new RuntimeException();
        } catch (Exception e){
            System.out.println("Введите минуты");
            return;
        }

        nMin = nMin - ((int)(nMin/5)*5);
        //System.out.println(nMin);

        if (nMin >= 0 && nMin < 3) {
            System.out.println("зелёный");
        }
        else {
            if (nMin >=3 && nMin < 4) {
                System.out.println("жёлтый");
            }
            else {
                System.out.println("красный");
            }
        }
    }
}