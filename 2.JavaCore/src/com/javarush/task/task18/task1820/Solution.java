package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        StringBuilder stringBuilder = new StringBuilder();
        int i;
        do {
            i = bufferedInputStream.read();
            if (i != (int) ' ' && i != -1) {
                stringBuilder.append((char) i);
            } else {
                if (stringBuilder != null) {
                    bufferedOutputStream.write(((Math.round(Float.parseFloat(stringBuilder.toString()))) + " ").getBytes());
                    stringBuilder = new StringBuilder();
                }
            }
        } while (i != -1);

        bufferedInputStream.close();
        bufferedOutputStream.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
