package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(72, 0.9));
        System.out.println(convertEurToUsd(70, 0.99));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return (double) eur * course;
    }
}
