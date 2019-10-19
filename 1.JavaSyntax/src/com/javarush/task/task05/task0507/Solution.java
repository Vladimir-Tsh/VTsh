package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN;
        int n = 0, S = 0;
        float nS = 0;
        //boolean isEnd = false;
        while (true){
            sN = reader.readLine();
            if (sN.equals("-1"))
                break;
            else
                try {
                    S += Integer.parseInt(sN);
                    n++;
                    nS = (float) S/n;
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.out.println("Вводите целые числа");
                    System.exit(0);
                }
            //isEnd = sN.equals("-1");
        }
        System.out.println(Float.toString(nS));
    }
}