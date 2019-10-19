package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        String sD = reader.readLine();

        int nA = 0, nB = 0, nC = 0, nD = 0;

        try {
            nA = Integer.parseInt(sA);
            nB = Integer.parseInt(sB);
            nC = Integer.parseInt(sC);
            nD = Integer.parseInt(sD);
            //if (nC == 0) throw new RuntimeException("ввели нуль");
        } catch (Exception e){
            //System.out.println(e);
            System.out.println("Ведите целые числа");
            return;
        }

        System.out.println(Max(Max(nA, nB), Max(nC, nD)));
    }

    public static int Max(int a, int b) {
        if (a >= b) return a;
        else return b;
    }
}
