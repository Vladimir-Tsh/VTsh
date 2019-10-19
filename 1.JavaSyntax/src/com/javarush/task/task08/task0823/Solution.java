package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        int i = 0;
        StringBuffer newS = new StringBuffer(s);
        while (i != -1){
            i = s.indexOf(' ', i);
            //System.out.println("indexOf( ) = " + i);
            if (i+1 != s.length())
                newS.replace(i+1, i+2, s.substring(i+1, i+2).toUpperCase());
            if (i != -1) i++;
        }
        s = newS.toString();
        System.out.println(s);
    }
}
