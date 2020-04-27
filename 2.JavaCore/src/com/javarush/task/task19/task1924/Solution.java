package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static String wordToString(String s) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (s.equals(entry.getKey().toString())) return entry.getValue();
        }
        return s;
    }
    public static void strToConsole(String s) {
        Pattern p = Pattern.compile(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(p.split(s)));
        for (String word : words) {
            System.out.print(wordToString(word) + ' ');
        }
        System.out.print('\n');
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
