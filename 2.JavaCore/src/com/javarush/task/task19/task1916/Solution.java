package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        BufferedReader reader;
        String file1, file2;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            file1 = reader.readLine();
            file2 = reader.readLine();
            reader.close();
            ArrayList<String> arrayListFromFile1 = fromFileToArrayList(file1);
            ArrayList<String> arrayListFromFile2 = fromFileToArrayList(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> fromFileToArrayList(String fileName) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            arrayList.add(reader.readLine());
        }
        reader.close();
        return arrayList;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
