package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();

        int nA = 0, nB = 0;

        try {
            nA = Integer.parseInt(sA);
            nB = Integer.parseInt(sB);
            //if (nC == 0) throw new RuntimeException("ввели нуль");
            } catch (Exception e){
            //System.out.println(e);
            System.out.println("Ведите целые числа");
            return;
            }

         if (nA <= nB) {
             System.out.println(nA);
         }
         else System.out.println(nB);
    }
}