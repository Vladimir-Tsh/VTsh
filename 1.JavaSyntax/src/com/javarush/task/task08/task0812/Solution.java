package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        //System.out.println(list.size());
        /*for (int n : list)
            System.out.println(n);*/
        ArrayList<Integer> listSeq = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++){
            int n = 1;
            for (int j = i + 1; j < 10; j++){
                //System.out.println("i: " + list.get(i) + ", j: " + list.get(j));
                if (list.get(i).equals(list.get(j)))
                    n++;
                else break;
            }
            listSeq.add(n);
        }
        /*for (int n : listSeq)
            System.out.println(n);*/
        System.out.println(Collections.max(listSeq));
    }
}