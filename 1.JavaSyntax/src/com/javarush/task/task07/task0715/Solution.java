package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> myAL = new ArrayList<>();
        Collections.addAll(myAL,"мама", "мыла", "раму");
        int sL = myAL.size();
        for (int i = 0; i < sL; i++)
            myAL.add(2 * i + 1, "именно");
        for (String s : myAL)
            System.out.println(s);
    }
}
