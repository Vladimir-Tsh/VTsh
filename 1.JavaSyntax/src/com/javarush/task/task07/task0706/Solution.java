package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayH = new int[15];
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arrayH.length; i++){
            arrayH[i] = Integer.parseInt(reader.readLine());
            if (i%2 == 0)
                evenSum += arrayH[i];
            else
                oddSum += arrayH[i];
        }
        if (evenSum > oddSum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
