package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sLine = reader.readLine();
        String sLineTrue = "";
        String sLineFalse = "";
        /*for (int i = 0; i < sLine.length(); i++) {

        }*/
        for (char l : sLine.toCharArray()) {
            if (isVowel(l)) {
                sLineTrue = sLineTrue + l + ' ';
            }
            else {
                if (l != ' ') {
                    sLineFalse = sLineFalse + l + ' ';
                }
            }
        }
        System.out.println('\'' + sLineTrue + '\'');
        System.out.println('\'' + sLineFalse + '\'');
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}