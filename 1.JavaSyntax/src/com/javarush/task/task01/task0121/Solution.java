package com.javarush.task.task01.task0121;

/* 
Контракт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s1 = "Меня зовут Амиго.";
        String s2 = "Я согласен на зарплату $";
        String s3 = "/месяц ";
        String s4 = "в первый год.";
        String s5 = "во второй год.";
        String s6 = "в третий год.";
        String s7 = "в четвертый год.";
        String s8 = "в пятый год.";
        int a1 = 800, a2 = 1500, a3 = 2200, a4 = 2700, a5 = 3200;
        String s9 = "Поцелуй мой блестящий металлический зад!";
        System.out.println(s1 + '\n');
        System.out.println(s2 + a1 + s3 + s4);
        System.out.println(s2 + a2 + s3 + s5);
        System.out.println(s2 + a3 + s3 + s6);
        System.out.println(s2 + a4 + s3 + s7);
        System.out.println(s2 + a5 + s3 + s8 + '\n');
        System.out.println(s9);
    }
}
