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
        String resultFile;
        Set<String> fileNames = new TreeSet<>();
        while (!((fileName = reader.readLine()).equals("end"))) {
            fileNames.add(fileName);
        }

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream());
        for (String fName :
                fileNames) {
//            System.out.println(fName);
        }

    }
}
