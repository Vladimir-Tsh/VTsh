package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);
        StringBuilder line = new StringBuilder("");
        while (fileReader.ready()) {
            line.append((char) fileReader.read());
        }
//        System.out.println(line);
        fileReader.close();
        Pattern pattern = Pattern.compile("\\p{Punct}|\\s|\\n");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(pattern.split(line)));
        int countWorld = 0;
        for (String word: words) {
//            System.out.println(":" + word + ":");
            if (word.toLowerCase().equals("world")) {
                countWorld++;
            }
        }
        System.out.println(countWorld);
    }
}
