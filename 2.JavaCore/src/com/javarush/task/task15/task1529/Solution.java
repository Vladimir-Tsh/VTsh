package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String obj = reader.readLine();
            if (obj.equals("helicopter")) {
                result = new Helicopter();
            } else {
                if (obj.equals("plane")) {
                    String strCountPas = reader.readLine();
                    try {
                        int countPas = Integer.parseInt(strCountPas);
                        result = new Plane(countPas);
                    } catch (NumberFormatException eNF) {
                        eNF.printStackTrace();
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
