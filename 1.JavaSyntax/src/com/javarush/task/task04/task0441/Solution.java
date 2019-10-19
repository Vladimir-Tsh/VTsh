package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = 3; // нечётное

        String[] sA = new String[N];
        float[] nA = new float[N];

        try {
            for (int i = 0; i < N; i++){
                sA[i] = reader.readLine();
                nA[i] = Float.parseFloat(sA[i]);
            }
        } catch (Exception e){
            System.err.println(e);
            System.exit(0);
        }

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (nA[i] > nA[j]){
                    float a = nA[i];
                    nA[i] = nA[j];
                    nA[j] = a;
                }

        System.out.print(nA[N/2]);*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int nA = Integer.parseInt(sA);
        int nB = Integer.parseInt(sB);
        int nC = Integer.parseInt(sC);

        if ((nA >= nB && nA <= nC) || (nA >= nC && nA <= nB))
            System.out.print(nA);
        else
            if ((nB >= nA && nB <= nC) || (nB >= nC && nB <= nA))
                System.out.print(nB);
            else
                System.out.print(nC);
    }
}