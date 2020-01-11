package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
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
        inputStream.close();

        List<Integer> sortValuesOfMap = new ArrayList<>();
        sortValuesOfMap.addAll(readMap.values());
        Collections.sort(sortValuesOfMap);

        int maxValue = sortValuesOfMap.get(sortValuesOfMap.size() - 1);

        for (Integer keyOfReadMap : readMap.keySet()) {
            if (readMap.get(keyOfReadMap) == maxValue) {
                System.out.print(keyOfReadMap.toString() + ' ');
            }
        }
    }
}
