package com.javarush.task.task08.task0815;

import java.util.*;

import static java.util.Collections.*;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countNames = 0;
        for (String entryVal : map.values()){
            if (entryVal.equals(name))
                countNames++;
        }
        return countNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLNames = 0;
        for (String entryKey : map.keySet()){
            if (entryKey.equals(lastName))
                countLNames++;
        }
        return countLNames;
    }

    public static void main(String[] args) {

    }
}
