package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> peopleList = new HashMap<String, String>();
        peopleList.put("Иванов", "Иван");
        peopleList.put("Иванов1", "Иван1");
        peopleList.put("Иванов2", "Иван");
        peopleList.put("Иванов3", "Иван2");
        peopleList.put("Иванов4", "Иван3");
        peopleList.put("Иванов5", "Иван4");
        peopleList.put("Иванов6", "Иван5");
        peopleList.put("Иванов7", "Иван2");
        peopleList.put("Иванов", "Иван4");
        peopleList.put("Иванов9", "Иван6");
        return peopleList;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
