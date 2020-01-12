package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean next = true;
        while (next) {
            String fileName = reader.readLine();

            FileInputStream inputStream = new FileInputStream(fileName);
            if (inputStream.available() < 1000) {
                inputStream.close();
                throw new DownloadException();
            }
            inputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
