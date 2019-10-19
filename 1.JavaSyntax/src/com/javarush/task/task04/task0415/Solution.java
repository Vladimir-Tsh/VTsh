package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int nA = 0, nB = 0, nC = 0;

        try {
            nA = Integer.parseInt(sA);
            nB = Integer.parseInt(sB);
            nC = Integer.parseInt(sC);

            if (nA <= 0 || nB <= 0 || nC <= 0) throw new RuntimeException();
        } catch (Exception e){
            System.out.println("Ведите целые положительные числа");
            return;
        }

        if (nA < nB + nC && nB < nA + nC && nC < nA + nB) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }
}