package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        boolean next = true;

        do {
            String name = reader.readLine();
            if (!name.isEmpty()) {
                String index = reader.readLine();
                map.put(index, Integer.parseInt(name));
                if (index.isEmpty()) {
                    next = false;
                }
            } else next = false;
        } while (next);

        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            String index = pair.getKey();
            Integer name = pair.getValue();
            System.out.println(name.toString() + ' ' + index);
        }
    }
}
