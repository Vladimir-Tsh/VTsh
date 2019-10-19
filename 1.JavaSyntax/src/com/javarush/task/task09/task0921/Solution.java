package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> chisla = new ArrayList<Integer>();
        try {
            while (true) {
                chisla.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (IOException | NumberFormatException e) {
            for (Integer ch : chisla)
                System.out.println(ch);
        }
    }
}
