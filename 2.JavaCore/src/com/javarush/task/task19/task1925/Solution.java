package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution {

    public static ArrayList<String> arrayWordsToArrayWordsWithDigits(ArrayList<String> words) {
        ArrayList<String> wordsMoreThanSix = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 6) wordsMoreThanSix.add(word);
        }
        return wordsMoreThanSix;
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
            StringBuilder s = new StringBuilder();
            while (reader.ready()) {
                s.append(reader.readLine() + ' ');
            }
            wordsToFile = arrayWordsToArrayWordsWithDigits(new ArrayList<>(Arrays.asList(p.split(s))));
            if (wordsToFile.size() > 1) {
                for (int i = 0; i < wordsToFile.size() - 1; i++) {
                    writer.write(wordsToFile.get(i) + ',');
                }
            }
            if (wordsToFile.size() > 0) {
                writer.write(wordsToFile.get(wordsToFile.size() - 1));
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
