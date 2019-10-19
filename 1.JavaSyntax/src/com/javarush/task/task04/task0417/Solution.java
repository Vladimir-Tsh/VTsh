package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
            //if (nC == 0) throw new RuntimeException("ввели нуль");
        } catch (Exception e){
            //System.out.println(e);
            System.out.println("Ведите целые числа");
            return;
        }

        if (nA == nB && nA == nC) {
            System.out.println(nA + " " + nB + " " + nC);
        }
        else {
            if (nA == nB || nA == nC) {
                System.out.println(nA + " " + nA);
            }
            else {
                if (nB == nC) {
                    System.out.println(nB + " " + nB);
                }
            }
        }
    }
}