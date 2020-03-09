package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //выводим ее в консоль
        Pattern pattern = Pattern.compile("(\\d+) (.) (\\d+) (.+)");
        Matcher matcher = pattern.matcher(result);
        int rez = 0;
        if (matcher.find()) {
            switch (matcher.group(2)) {
                case "+":
                    rez = Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3));
                    break;
                case "*":
                    rez = Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3));
                    break;
                case "-":
                    rez = Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3));
                    break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(matcher.group());
        stringBuilder.append(rez);
        String resultSir = stringBuilder.toString();
        System.out.println(resultSir);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

