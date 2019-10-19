package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int N = 0, L = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            N = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Вводите целые числа");
            System.exit(0);
        }
        L = String.valueOf(Math.abs(N)).length();
        //System.out.println("L = " + L);
        for(int i = 0; i < L; i++){
            int d = N % 10;
            if (/*d != 0 &&*/ (d % 2) == 0)
                even ++;
            else
                //if (d != 0)
                    odd ++;
            N = N / 10;
            //System.out.println("d = " + d);
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
