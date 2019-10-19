package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();

        int nA;
        boolean s, c;

        try {
            nA = Integer.parseInt(sA);
        } catch (Exception e){
            //System.err.println(e);
            System.out.println("Ведите целое число");
            return;
        }

        s = (nA > 0);
        c = (nA/2*2 == nA);

        if (nA == 0)
            System.out.println("ноль");
        else
            if (s && c)
                System.out.println("положительное четное число");
            else
                if (s)
                    System.out.println("положительное нечетное число");
                else
                    if (c)
                        System.out.println("отрицательное четное число");
                    else
                        System.out.println("отрицательное нечетное число");
    }
}
