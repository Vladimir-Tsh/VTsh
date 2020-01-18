package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);

        int i;
        StringBuilder file1 = new StringBuilder();
        while((i = fileInputStream1.read())!= -1){
            file1.append((char) i);
        }
        fileInputStream1.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        while((i = fileInputStream2.read())!= -1){
            fileOutputStream.write(i);
        }

        fileOutputStream.write(file1.toString().getBytes());

        fileInputStream2.close();
        fileOutputStream.close();
    }
}
