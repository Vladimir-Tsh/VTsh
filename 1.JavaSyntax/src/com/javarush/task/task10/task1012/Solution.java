package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (Character c: alphabet) {
            charCount.put(c, 0);
        }
        for (String s: list){
            for (int i = 0; i < s.length(); i++){
                if (alphabet.contains(s.charAt(i))) {
                    int k = charCount.get(s.charAt(i));
                    k++;
                    charCount.put(s.charAt(i), k);
                }
            }
        }
        for (Character c: alphabet){
            System.out.println(c.toString() + ' ' + charCount.get(c));
        }
    }
}
