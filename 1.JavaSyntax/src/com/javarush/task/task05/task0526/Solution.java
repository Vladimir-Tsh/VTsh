package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Piter", 18, "New York");
        Man man2 = new Man("John", 32, "LosAngeles");
        Woman woman1 = new Woman("Jane", 20, "Piter");
        Woman woman2 = new Woman("Lucy", 30, "Paris");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Human{
        public String name, address;
        public int age;

        public String toString(){
            return (String) (name + " " + age + " " +  address);
        }
    }
    public static class Man extends Human{
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman extends Human{
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
