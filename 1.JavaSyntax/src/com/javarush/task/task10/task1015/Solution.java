package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] ArrOfStrList = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Первый");
        list1.add("список");
        list1.add("строк");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Второй");
        list2.add("список");
        list2.add("строк");
        ArrOfStrList[0] = list1;
        ArrOfStrList[1] = list2;
        return ArrOfStrList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}