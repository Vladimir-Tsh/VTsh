package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFileName = reader.readLine();
        String outFileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(inFileName);
        FileWriter fileWriter = new FileWriter(outFileName);
        int i = 0;
        while (fileReader.ready()) {
            i++;
            int data = fileReader.read();
            if (i%2 == 0) {
                fileWriter.write(data);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
