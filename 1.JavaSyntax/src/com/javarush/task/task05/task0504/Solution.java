package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Cat1", 4, 5, 3);
        Cat cat2 = new Cat("Cat2", 3, 6, 5);
        Cat cat3 = new Cat("Cat3", 9, 9, 4);
        //System.out.println(cat1.name);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}