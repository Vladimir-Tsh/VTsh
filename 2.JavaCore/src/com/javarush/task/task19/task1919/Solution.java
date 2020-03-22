package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];

        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        Map<String, Double> zarplata = new TreeMap<>();
        String line;
        String name;
        Double value;
        while (fileReader.ready()) {
            line = fileReader.readLine();
            name = line.substring(0, line.indexOf(" "));
            value = Double.valueOf(line.substring(line.indexOf(" ") + 1));
            if (zarplata.containsKey(name)) {
                zarplata.put(name, value + zarplata.get(name));
            } else {
                zarplata.put(name, value);
            }
        }

        fileReader.close();

        for (Map.Entry<String, Double> z: zarplata.entrySet()) {
            System.out.println(z.getKey() + " " + z.getValue());
        }
    }
}
