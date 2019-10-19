package com.javarush.task.task14.task1411;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        ArrayList<String> listKeys = new ArrayList<>(Arrays.asList("user", "loser", "coder", "proger"));
        //тут цикл по чтению ключей, пункт 1
        while (listKeys.contains(key = reader.readLine()))
        {
            //создаем объект, пункт 2
            switch (listKeys.indexOf(key)) {
                case 0: person = new Person.User(); break;
                case 1: person = new Person.Loser(); break;
                case 2: person = new Person.Coder(); break;
                case 3: person = new Person.Proger(); break;
            }
            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
