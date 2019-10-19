package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sS = reader.readLine();
        String sN = reader.readLine();
        int nN = 0;

        try {
            nN = Integer.parseInt(sN);
            if (nN <= 0) throw new RuntimeException("Число должно быть больше нуля");
        } catch (Exception e){
            System.err.println(e);
            System.out.println("Ведите целое положительное число");
            System.exit(0);
        }

        while (nN != 0){
            System.out.println(sS);
            nN--;
        }
    }
}
