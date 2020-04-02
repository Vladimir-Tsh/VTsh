package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        String file = args[0];

        Map<String, Double> zarplata = new TreeMap<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));

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
        } catch (IOException e) {
            System.out.println("Что-то с файлом... " + e.getMessage());
        }

        Double max = 0.0;
        for (Double z: zarplata.values()) {
            if (max < z) max = z;
        }

        for (Map.Entry<String, Double> z: zarplata.entrySet()){
            if (z.getValue().equals(max)) System.out.println(z.getKey());
        }
    }
}
