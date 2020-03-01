package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine();
        String fileNameOut = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameIn));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNameOut));
        Pattern pattern = Pattern.compile("\\p{Punct}|\\s|\\n");
        while (fileReader.ready()) {
            String line =  fileReader.readLine();
            ArrayList<String> words = new ArrayList<>(Arrays.asList(pattern.split(line)));
            for (String word : words) {
                if (Pattern.matches("\\d+", word)) {
                    fileWriter.write(word + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
