package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        int buffSize = inputStream.available();

        byte[] outBuff = new byte[buffSize];

        inputStream.read(outBuff);

        for (int i = buffSize - 1; i >= 0; i--) {
            outputStream.write(outBuff, i, 1);
        }

        inputStream.close();
        outputStream.close();
    }
}
