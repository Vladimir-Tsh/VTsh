package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            if (s.matches("^[-+.]?[0-9]+[.]?[0-9]*") || s.matches("^[-+.]?[0-9]*[.]?[0-9]+")) {
                if (s.matches("[-+]?[0-9]+[.][0-9]*") || s.matches("[-+]?[0-9]*[.][0-9]+")) {
                    print(Double.parseDouble(s));
                } else if (s.matches("[+]?[1-9][0-9]*") && Integer.parseInt(s) < 128)
                    print(Short.parseShort(s));
                else if ((s.matches("[-+]?[1-9][0-9]+") || s.matches("[-]?[0-9]")) && (Integer.parseInt(s) >= 128 || Integer.parseInt(s) <= 0))
                    print(Integer.parseInt(s));
            }
            else
                print(s);
            //System.out.println(s.matches("^[-.]?[0-9]*[.]?[0-9]*"));
            //System.out.println(s.matches("[-]?[0-9]+"));
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
