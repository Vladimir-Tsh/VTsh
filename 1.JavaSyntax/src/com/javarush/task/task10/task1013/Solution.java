package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private boolean sex;
        private int age;
        private int growth;
        private int weight;

        public Human(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, boolean sex, int age){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, int age, int growth, int weight){
            this.name = name;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int growth, int weight){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, boolean sex, int age, int growth,int weight){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, String surname, boolean sex, int age, int growth, int weight){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }
    }
}
