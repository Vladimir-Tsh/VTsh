package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = 0, B = 0;
        //try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
            if (A <= 0 || B <= 0) throw new Exception();
            System.out.println(foundNOD(A, B));
        //} catch (NumberFormatException e) {
        //    e.printStackTrace();
        //}
    }

    public static int foundNOD(int a, int b){
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return (a + b);
    }
}
