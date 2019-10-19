package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minL;
        for (int i = 0; i < 5; i++)
            strings.add(reader.readLine());
        minL = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++){
            if (minL > strings.get(i).length())
                minL = strings.get(i).length();
        }
        //for (int i = 0; i < strings.size(); i++)
        //  if (strings.get(i).length() == minL)
        //    System.out.println(strings.get(i));
        for (String s : strings)
            if (s.length() == minL)
                System.out.println(s);
    }
}
