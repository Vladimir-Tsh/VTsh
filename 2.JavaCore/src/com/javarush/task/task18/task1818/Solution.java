package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1, true);
        FileInputStream fileInputStream1 = new FileInputStream(fileName2);
        FileInputStream fileInputStream2 = new FileInputStream(fileName3);

        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(fileInputStream1, 200);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream2, 200);

        int i;

        while((i = bufferedInputStream1.read())!= -1){
            fileOutputStream.write(i);
        }

        while((i = bufferedInputStream2.read())!= -1){
            fileOutputStream.write(i);
        }

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
