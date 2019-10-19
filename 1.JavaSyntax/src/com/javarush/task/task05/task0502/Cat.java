package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if ((this.strength * (1-4*(this.age/15 - 1/2)^2) * (4 * (this.weight/12 - 1/2)^3 + 1/2))
                >
                (anotherCat.strength * (1-4*(anotherCat.age/15 - 1/2)^2) * (4 * (anotherCat.weight/12 - 1/2)^3 + 1/2)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}