package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;

        while ((line = fileReader.readLine()) != null) {
            if (line.indexOf(args[0] + " ") == 0) {
                //System.out.println(line.substring(args[0].length() + 1));
                System.out.println(line);
            }
        }

        fileReader.close();
    }
}
