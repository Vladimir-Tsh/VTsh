package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> intHashSet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            intHashSet.add(i + 1);
        return  intHashSet;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            Integer intSet = iter.next();
            if (intSet > 10)
                iter.remove();
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
