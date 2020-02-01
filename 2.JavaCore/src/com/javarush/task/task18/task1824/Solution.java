package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        List<BufferedReader> fileReaders = new ArrayList<>();
        boolean readNextFileName = true;
        while (readNextFileName) {
            try {
                fileName = readerFileName.readLine();
                fileReaders.add(new BufferedReader(new InputStreamReader(new FileInputStream(fileName))));
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                for (BufferedReader fileReader : fileReaders) {
                    try {
                        fileReader.close();
                    } catch (IOException ex) {
                        System.out.println("fileReader.close exception:");
                        ex.printStackTrace();
                    }
                }
                readNextFileName = false;
            } catch (IOException e) {
                System.out.println("readerFileName.readLine exception:");
                e.printStackTrace();
            }
        }
    }
}
