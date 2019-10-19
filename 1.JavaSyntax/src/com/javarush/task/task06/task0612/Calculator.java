package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return (a + b);
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return (a - b);
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return (a * b);
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        //double div = 0, dA = a, dB = b;
        //div = dA/dB;
        return (double) a/b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        //double per = 0, dA = a, dB = b;
        //per = dA*dB/100;
        return (double)a*b/100;
    }

    public static void main(String[] args) {
        System.out.println(division(3, 2));
        System.out.println(percent(10, 34));
    }
}