package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] s = new String[3];
        s[0] = "Мама";
        s[1] = "Мыла";
        s[2] = "Раму";
        //s[3] = "Мылом ";
        perMas(Arrays.asList(s), 0);
    }
    public static void perMas (List<String> mass, int k){
        for (int i = k; i < mass.size(); i++) {
            Collections.swap(mass, i, k);
            perMas(mass, k + 1);
            Collections.swap(mass, k, i);
        }
        if (k == mass.size() - 1){
            //System.out.println(Arrays.toString(mass.toArray()));
            for (int i = 0; i < mass.size(); i++)
                System.out.print(mass.toArray()[i]);
            System.out.print('\n');
        }
    }
}