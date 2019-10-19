package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> crMap = new HashMap<String, Integer>();
        crMap.put("Иванов", 100);
        crMap.put("Иванов1", 200);
        crMap.put("Иванов2", 300);
        crMap.put("Иванов3", 400);
        crMap.put("Иванов4", 500);
        crMap.put("Иванов5", 600);
        crMap.put("Иванов6", 700);
        crMap.put("Иванов7", 800);
        crMap.put("Иванов8", 900);
        crMap.put("Иванов9", 100);
        return crMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}