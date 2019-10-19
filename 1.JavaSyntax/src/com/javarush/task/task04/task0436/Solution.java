package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
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
            if (nA * nB <= 0) throw new RuntimeException("<=0");
        } catch (Exception e){
            System.err.println(e);
            System.out.println("Ведите целые положительные числа");
            System.exit(0);
        }
        for(int i = 0; i < nA; i++){
            for(int j = 0; j < nB; j++)
                System.out.print("8");
            System.out.print("\n");
        }
    }
}
