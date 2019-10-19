package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Files;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String line = null;
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            do {
                line = reader.readLine();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            while (!line.equals("exit"));
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
