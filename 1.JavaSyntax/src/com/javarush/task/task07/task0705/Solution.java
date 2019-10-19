package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayB = new int[20];
        int[] arrayH1 = new int[10];
        int[] arrayH2 = new int[10];
        for (int i = 0; i < arrayB.length; i++)
            arrayB[i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 10; i++){
            arrayH1[i] = arrayB[i];
            arrayH2[i] = arrayB[i + 10];
        }
        for (int i = 0; i < arrayH2.length; i++)
            System.out.println(arrayH2[i]);
    }
}
