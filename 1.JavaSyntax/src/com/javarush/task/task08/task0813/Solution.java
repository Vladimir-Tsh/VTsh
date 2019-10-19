package com.javarush.task.task08.task0813;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> stringSet = new HashSet<String>();
        boolean b = Collections.addAll(stringSet, "ЛАБА", "ЛАБАЗ", "ЛАБАКИ", "ЛАБАРДАН", "ЛАБАШАК",
                                                            "ЛАБЕЦ", "ЛАБЗИТЬ", "ЛАБИРИНТ", "ЛАБОРАТОРИЯ", "ЛАБОШАК",
                                                            "ЛАБРАДОР", "ЛАБУЗЬЕ", "ЛАБУТА", "ЛАВА", "ЛАВАНДА",
                                                            "ЛАВДА", "ЛАВЕРЖА", "ЛАВИНА", "ЛАВИРОВАТЬ", "ЛАВИЦА");
        /*stringSet.add("ЛАБА");
        stringSet.add("ЛАБАЗ");
        stringSet.add("ЛАБАКИ");
        stringSet.add("ЛАБАРДАН");
        stringSet.add("ЛАБАШАК");
        stringSet.add("ЛАБЕЦ");
        stringSet.add("ЛАБЗИТЬ");
        stringSet.add("ЛАБИРИНТ");
        stringSet.add("ЛАБОРАТОРИЯ");
        stringSet.add("ЛАБОШАК");
        stringSet.add("ЛАБРАДОР");
        stringSet.add("ЛАБУЗЬЕ");
        stringSet.add("ЛАБУТА");
        stringSet.add("ЛАВА");
        stringSet.add("ЛАВАНДА");
        stringSet.add("ЛАВДА");
        stringSet.add("ЛАВЕРЖА");
        stringSet.add("ЛАВИНА");
        stringSet.add("ЛАВИРОВАТЬ");
        stringSet.add("ЛАВИЦА");*/
        System.out.println("result : " + b);
        return  stringSet;
    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>();
        stringSet = createSet();
        for (String text : stringSet)
        {
            System.out.println(text);
        }
    }
}
