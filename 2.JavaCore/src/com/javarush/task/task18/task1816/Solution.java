package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //System.out.println(args[0]);
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;
        int countEnglishLetters = 0;

        while ((i = bufferedInputStream.read()) != -1) {
            if ((i >= (int) 'a' && i <= (int) 'z') || (i >= (int) 'A' && i <= (int) 'Z')) {
                countEnglishLetters++;
            }
        }

        System.out.println(countEnglishLetters);

        bufferedInputStream.close();
        fileInputStream.close();
    }
}
