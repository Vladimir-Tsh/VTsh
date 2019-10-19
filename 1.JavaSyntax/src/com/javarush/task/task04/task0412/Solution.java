package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum > 0)
            System.out.println(nNum * 2);
        else
        if (nNum < 0)
            System.out.println(nNum + 1);
        else
            System.out.println(0);
    }

}