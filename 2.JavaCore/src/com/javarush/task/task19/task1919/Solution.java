package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
//        System.out.println(file);

        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        Map<String, Double> zarplata = new HashMap<>();
        String line;
        String name;
        Double value;
        while (fileReader.ready()) {
            line = fileReader.readLine();
            name = line.substring(0, line.indexOf(" "));
            value = Double.valueOf(line.substring(line.indexOf(" ") + 1));
            System.out.println(name + " : " + value);
        }
        fileReader.close();
    }
}
