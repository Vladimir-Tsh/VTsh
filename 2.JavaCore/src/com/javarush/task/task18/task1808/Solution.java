package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        //if (inputStream.available() > 0) {
            FileOutputStream outputStream1 = new FileOutputStream(fileName2);
            FileOutputStream outputStream2 = new FileOutputStream(fileName3);

            int inputSize = inputStream.available();
            int buffSize = inputSize / 2 + inputSize % 2;

            byte[] outBuff = new byte[buffSize];

            inputStream.read(outBuff);
            outputStream1.write(outBuff);

            inputStream.read(outBuff);
            outputStream2.write(outBuff,0, buffSize - inputSize % 2);

            outputStream1.close();
            outputStream2.close();
        //}

        inputStream.close();
    }
}
