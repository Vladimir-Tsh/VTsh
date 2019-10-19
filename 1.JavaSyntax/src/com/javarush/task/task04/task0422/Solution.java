package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sName = reader.readLine();
        String sAge = reader.readLine();

        float nAge;

        try {
            nAge = Float.parseFloat(sAge);
            if (nAge == 0) throw new RuntimeException("Ввели нуль");
        } catch (Exception e){
            System.err.println(e);
            System.out.println("Ведите положительное число");
            return;
        }

        if (nAge < 18)
            System.out.println("Подрасти еще");
    }
}