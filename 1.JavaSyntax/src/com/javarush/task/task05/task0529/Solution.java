package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN;
        int S = 0;
        while (true){
            sN = reader.readLine();
            if (sN.equals("сумма"))
                break;
            else
                try {
                    S += Integer.parseInt(sN);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.out.println("Вводите целые числа");
                    System.exit(0);
                }
        }
        System.out.println(Integer.toString(S));
    }
}
