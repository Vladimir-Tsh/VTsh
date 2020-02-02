package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String resultFile = "";
        Set<String> fileNames = new TreeSet<>();
        while (!((fileName = reader.readLine()).equals("end"))) {
            fileNames.add(fileName);
            resultFile = fileName.substring(0, fileName.lastIndexOf(".part"));
        }

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(resultFile));
        int i;
        for (String fName :
                fileNames) {
//            System.out.println(fName);
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fName));
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            inputStream.close();
        }
        outputStream.close();

//        System.out.println(resultFile);

    }
}
