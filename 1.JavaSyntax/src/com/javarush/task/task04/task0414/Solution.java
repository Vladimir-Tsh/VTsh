package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sYear = reader.readLine();
        int nYear = 0;
        try {
            nYear = Integer.parseInt(sYear);
        } catch (Exception e){
            System.out.println("Ведите целое число > 0 и < 10000");
            return;
        }

        if (nYear > 0 && nYear < 10000) {
            //System.out.println("OK");
            if (((nYear/4*4 == nYear) && (nYear/100*100 != nYear)) || (nYear/400*400 == nYear)) {
                System.out.println("количество дней в году: 366");
            }
            else {
                System.out.println("количество дней в году: 365");
            }
        }
        else {
            System.out.println("Ведите другой год");
        }
    }
}