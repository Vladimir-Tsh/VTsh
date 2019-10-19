package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        return sStr;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        int iStr = Integer.parseInt(sStr);
        return iStr;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        double dStr = Double.parseDouble(sStr);
        return dStr;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        boolean bStr = Boolean.parseBoolean(sStr);
        return bStr;
    }

    public static void main(String[] args) {

    }
}
