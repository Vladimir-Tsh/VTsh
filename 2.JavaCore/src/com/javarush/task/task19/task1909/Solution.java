package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
        Pattern pattern = Pattern.compile("\\.");
        while (fileReader.ready()) {
            String line =  fileReader.readLine();
//            System.out.println(line);
            Matcher matcher = pattern.matcher(line);
//            System.out.println(matcher.replaceAll("!"));
            fileWriter.write(matcher.replaceAll("!") + "\n");
        }
        fileReader.close();
        fileWriter.close();
    }
}
