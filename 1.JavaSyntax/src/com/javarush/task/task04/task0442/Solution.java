package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN;
        boolean isEnd = false;
        int S = 0;
        while (!isEnd){
            sN = reader.readLine();
            try {
                S += Integer.parseInt(sN);
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Вводите целые числа");
                System.exit(0);
            }
            isEnd = sN.equals("-1");
        }
        System.out.println(Integer.toString(S));
    }
}