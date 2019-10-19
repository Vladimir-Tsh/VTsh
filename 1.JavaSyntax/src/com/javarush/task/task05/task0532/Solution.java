package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int N=0;
        boolean nOk = false, anOk = false;
        while (!nOk) {
            try {
                N = Integer.parseInt(reader.readLine());
                if(N > 0)
                    nOk = true;
            } catch (Exception e) {
                System.out.println("Целое + ? " + e.getMessage());
                nOk = false;
            }
        }
        int[] aN = new int[N];
        while(!anOk) {
            try {
                for (int i = 0; i < N; i++)
                    aN[i] = Integer.parseInt(reader.readLine());
                anOk = true;
            }catch (Exception e){
                System.out.println("Число? " + e.getMessage());
                anOk = false;
            }
        }
        for (int i = 0; i < (N - 1); i++)
            for (int j = i + 1; j < N; j++) {
                if (aN[i] > aN[j]) {
                    int a = aN[i];
                    aN[i] = aN[j];
                    aN[j] = a;
                }
            }
        maximum = aN[N - 1];
        System.out.println(maximum);
    }
}