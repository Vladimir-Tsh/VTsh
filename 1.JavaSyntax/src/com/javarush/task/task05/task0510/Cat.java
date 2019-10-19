package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    protected String name, address, color;
    protected int age, weight;

    public  void initialize(String name){
        this.name = name;
        color = "black";
        age = 4;
        weight = 5;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = 6;
        color = "gray";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
