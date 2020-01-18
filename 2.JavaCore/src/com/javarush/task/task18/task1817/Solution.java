package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;
        int countSymbol = 0;
        int countSpace = 0;

        while ((i = bufferedInputStream.read()) != -1) {
            countSymbol++;
            if (i == (int) ' ') {
                countSpace++;
            }
        }

        double ratio = (double) countSpace/countSymbol;
        System.out.println(Math.round(ratio * 10000.0) / 100.0);

        bufferedInputStream.close();
        fileInputStream.close();
    }
}
