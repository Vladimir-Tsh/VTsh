package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        String file = null;
        try {
            file = args[0];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не задано имя файла");
            e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println(file);
        }

    }
}
