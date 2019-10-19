package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> genList = new ArrayList<Integer>();
        ArrayList<Integer> divbythreeList = new ArrayList<Integer>();
        ArrayList<Integer> divbytwoList = new ArrayList<Integer>();
        ArrayList<Integer> otherList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
            genList.add(Integer.parseInt(reader.readLine()));
        for (int i : genList) {
            if (i % 3 == 0)
                divbythreeList.add(i);
            if (i % 2 == 0)
                divbytwoList.add(i);
            else
                if (i % 3 != 0)
                    otherList.add(i);
        }

        printList(divbythreeList);
        //System.out.println(" ");
        printList(divbytwoList);
        //System.out.println(" ");
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i : list)
            System.out.println(i);
    }
}
