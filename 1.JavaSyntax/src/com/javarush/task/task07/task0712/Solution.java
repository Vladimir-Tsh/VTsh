package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxL = 0, minL, j = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            maxL = (maxL > strings.get(i).length() ? maxL : strings.get(i).length());
        }
        minL = strings.get(0).length();
        for (String s : strings)
            minL = (minL < s.length() ? minL : s.length());
        for (int i = strings.size() - 1; i >= 0; i--){
            if (strings.get(i).length() == maxL || strings.get(i).length() == minL)
                j = i;
        }
        System.out.println(strings.get(j));
    }
}
