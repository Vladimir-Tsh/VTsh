package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[2]));
        int i;

        switch (args[0]) {
            case "-e":
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i + 1);
                }
                break;
            case "-d":
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i - 1);
                }
                break;
        }
        inputStream.close();
        outputStream.close();
    }
}
