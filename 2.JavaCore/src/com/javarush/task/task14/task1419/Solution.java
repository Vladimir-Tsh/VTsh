package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            //2
            exceptions.get(exceptions.size());
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //3
            FileInputStream reader = new FileInputStream("c:\\file.f");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //4
            String s = null;
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //5
            Integer i = null;
            Integer k = i / 2;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //6
            throw new NegativeArraySizeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //7
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            //8
            throw new IllegalAccessException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //9
            throw new ArrayStoreException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            //10
            throw new EmptyStackException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
