package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> crMap = new HashMap<String, String>();
        crMap.put("Иванов", "Иван");
        crMap.put("Иванов1", "Иван1");
        crMap.put("Иванов2", "Иван");
        crMap.put("Иванов3", "Иван2");
        crMap.put("Иванов4", "Иван3");
        crMap.put("Иванов5", "Иван4");
        crMap.put("Иванов6", "Иван5");
        crMap.put("Иванов7", "Иван2");
        crMap.put("Иванов8", "Иван4");
        crMap.put("Иванов9", "Иван6");
        return crMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> delValues = new ArrayList<String>();
        for (Map.Entry<String, String> entry :map.entrySet())
            for (Map.Entry<String, String> pair : copy.entrySet())
                if (pair.getValue().equals(entry.getValue()) && !pair.getKey().equals(entry.getKey())) {
                    //System.out.println("map: " + entry.getKey() + ":" + entry.getValue() + ". pair: " + pair.getKey() + ":" + pair.getValue());
                    delValues.add(pair.getValue());
                }
        for (String value : delValues)
            removeItemFromMapByValue(map, value);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        //HashMap<String, String> myMap = new HashMap<>(createMap());

        //for (Map.Entry<String, String> entry : myMap.entrySet())
        //    System.out.println("1: " + entry.getKey() + " - " + entry.getValue());

        //removeTheFirstNameDuplicates(myMap);

        //for (Map.Entry<String, String> entry : myMap.entrySet())
        //    System.out.println("2: " + entry.getKey() + " - " + entry.getValue());
    }
}
