package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat []nCat = new Cat[10];
        for(int i = 0; i < 10; i++)
            nCat[i] = new Cat();

        // Выведи значение переменной catCount
        System.out.print(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        static public int catCount = 0;

        // Создай конструктор
        public Cat(){
            catCount++;
        }
    }
}
