package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();

        int nA, nB;

        try {
            nA = Integer.parseInt(sA);
            nB = Integer.parseInt(sB);
            if (nA == 0 || nB ==0) throw new RuntimeException("Ввели нуль");
        } catch (Exception e){
            //System.err.println(e);
            System.out.println("Ведите числа отличные от 0");
            return;
        }

        if (nA > 0 && nB > 0)
            System.out.println("1");
        else
            if (nA > 0)
                System.out.println("4");
            else
                if (nB > 0)
                    System.out.println("2");
                else
                    System.out.println("3");
    }
}
