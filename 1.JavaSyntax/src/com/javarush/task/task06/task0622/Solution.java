package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int m;
        int []ch = new int[5];
        for (int i = 0; i < 5; i++)
            ch[i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 5; j++)
                if (ch[i] > ch[j]){
                    m = ch[i]; ch[i] = ch[j]; ch[j] = m;
                }
        for (int i = 0; i < 5; i++)
            System.out.println(ch[i]);
    }
}
