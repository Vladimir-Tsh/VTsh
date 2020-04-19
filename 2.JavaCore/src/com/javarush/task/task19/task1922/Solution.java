package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static int countWords(ArrayList<String> strings) {
        int count = 0;
        for (String s : strings) {
            if (words.contains(s)) count++;
        }
        return count;
    }

    public static void strToConsole(String s) {
        Pattern p = Pattern.compile(" ");
        if (countWords(new ArrayList<>(Arrays.asList(p.split(s)))) == 2) System.out.println(s);
    }

    public static void main(String[] args) {

        BufferedReader reader;
        String file = "";
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
