package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        list.add(list1);
        int[] list2 = new int[]{1, 2};
        list.add(list2);
        int[] list3 = new int[]{1, 2, 3, 4};
        list.add(list3);
        int[] list4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        list.add(list4);
        int[] list5 = new int[]{};
        list.add(list5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
