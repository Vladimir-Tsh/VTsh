package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static ArrayList<String> arrayWordsToArrayWordsWithDigits(ArrayList<String> words) {
        ArrayList<String> wordsWithDigits = new ArrayList<>();
        Pattern containsDigit = Pattern.compile("\\d");
        for (String word : words) {
            Matcher matcher = containsDigit.matcher(word);
            if (matcher.find()) wordsWithDigits.add(word);
        }
        return wordsWithDigits;
    }

    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader;
        BufferedWriter writer;

        try {
            reader = new BufferedReader(new FileReader(file1));
            writer = new BufferedWriter(new FileWriter(file2));
            Pattern p = Pattern.compile(" ");
            ArrayList<String> wordsToFile;
            while (reader.ready()) {
                String s = reader.readLine();
                wordsToFile = arrayWordsToArrayWordsWithDigits(new ArrayList<>(Arrays.asList(p.split(s))));
                for (String word : wordsToFile) {
                    writer.write(word + ' ');
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
