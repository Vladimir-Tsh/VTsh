package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine();
        String fileNameOut = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameIn));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNameOut));
        Pattern pattern = Pattern.compile("\\p{Punct}|\\n");
        while (fileReader.ready()) {
            String line =  fileReader.readLine();
            Matcher matcher = pattern.matcher(line);
            fileWriter.write(matcher.replaceAll(""));
        }
        fileReader.close();
        fileWriter.close();
    }
}
