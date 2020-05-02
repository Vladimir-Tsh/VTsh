package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void strToConsole(String s) {
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        BufferedReader reader;
        String file;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            file = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                strToConsole(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
