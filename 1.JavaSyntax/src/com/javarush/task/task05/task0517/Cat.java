package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    protected String name, address, color;
    protected int age, weight;

    public Cat(String name){
        this.name = name;
        color = "black";
        age = 3;
        weight = 3;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        color = "grey";
        weight = 4;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 6;
    }

    public static void main(String[] args) {

    }
}
