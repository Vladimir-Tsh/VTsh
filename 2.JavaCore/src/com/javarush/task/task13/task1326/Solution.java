package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        List<Integer> arrayList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        String line;
        try {
            fileInputStream = new FileInputStream(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while ((line = bufferedReader.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                if (i%2 == 0) arrayList.add(i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
            fileInputStream.close();
        }
        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}
