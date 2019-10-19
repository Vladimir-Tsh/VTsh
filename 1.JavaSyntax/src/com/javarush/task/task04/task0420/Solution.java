package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 10;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sA = new String[N];
        for (int i = 0; i < N; i++)
            sA[i] = reader.readLine();

        int[] nA = new int[N];

        try {
            for (int i = 0; i < N; i++)
                nA[i] = Integer.parseInt(sA[i]);
            //if (nC == 0) throw new RuntimeException("ввели нуль");
        } catch (Exception e){
            //System.out.println(e);
            System.out.println("Ведите целые числа");
            return;
        }
        int a = 0;
        for (int i =0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (nA[i] < nA[j]) {
                    a = nA[i];
                    nA[i] = nA[j];
                    nA[j] = a;
                }
         for (int i = 0; i < N; i++)
             System.out.print(nA[i] + " ");
    }
}
