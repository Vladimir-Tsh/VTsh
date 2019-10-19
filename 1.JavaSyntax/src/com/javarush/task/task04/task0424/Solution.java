package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int nA, nB, nC;

        try {
            nA = Integer.parseInt(sA);
            nB = Integer.parseInt(sB);
            nC = Integer.parseInt(sC);
            //if (nAge <= 0) throw new RuntimeException("Ввели нуль или меньше");
        } catch (Exception e){
            //System.err.println(e);
            System.out.println("Ведите целые числа");
            return;
        }

        if (nA == nB)
            System.out.println("3");
        else
            if (nA == nC)
                System.out.println("2");
            else
                if (nB == nC)
                    System.out.println("1");
    }
}
