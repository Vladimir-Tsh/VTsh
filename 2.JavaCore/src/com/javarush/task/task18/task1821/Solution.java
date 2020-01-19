package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        Map<Integer, Integer> readMap = new HashMap<>();
        while (inputStream.available() > 0)
        {
            int dataTemp = inputStream.read();
            if (readMap.containsKey(dataTemp)) {
                int tempCount = readMap.get(dataTemp);
                readMap.replace(dataTemp, ++tempCount);
            } else {
                readMap.put(dataTemp, 1);
            }
        }

        List<Integer> sortValuesOfMap = new ArrayList<>();
        sortValuesOfMap.addAll(readMap.keySet());
        Collections.sort(sortValuesOfMap);

        for (int i : sortValuesOfMap) {
            System.out.println((char) i + " " + readMap.get(i));
        }

        inputStream.close();
    }
}
