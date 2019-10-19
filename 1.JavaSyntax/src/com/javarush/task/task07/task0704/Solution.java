package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayI = new int[10];
        for (int i = 0; i < arrayI.length; i++)
            arrayI[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < arrayI.length; i++)
            System.out.println(arrayI[arrayI.length - 1 - i]);
    }
}

