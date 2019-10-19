package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 3;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sA = new String[N];
        for (int i = 0; i < N; i++)
            sA[i] = reader.readLine();

        int[] nA = new int[N];
        int k = 0;

        try {
            for (int i = 0; i < N; i++){
                nA[i] = Integer.parseInt(sA[i]);
                if (nA[i] > 0)
                    k++;
            }
            //if (nC == 0) throw new RuntimeException("ввели нуль");
        } catch (Exception e){
            //System.out.println(e);
            System.out.println("Ведите целые числа");
            System.exit(0);
        }
        System.out.println(k);
    }
}
