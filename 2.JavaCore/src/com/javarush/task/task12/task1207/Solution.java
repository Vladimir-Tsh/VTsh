package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        int i = 5;
        Integer iN = 6;
        print(i);
        print(iN);
    }

    //Напишите тут ваши методы
    static void print(int i){
        System.out.println("int: " + i);
    }
    static void print(Integer iI){
        System.out.println("Integer: " + iI);
    }
}
