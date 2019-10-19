package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> alS = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
            alS.add(reader.readLine());
        alS.remove(2);
        for (int i = alS.size() - 1; i >=0; i--)
            System.out.println(alS.get(i));
    }
}


