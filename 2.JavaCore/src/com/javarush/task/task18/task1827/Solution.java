package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if ((args.length == 4) && args[0].equals("-c") && (args[2].length() <= 8) && (args[3].length() <= 4)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedReader readerFromFile = new BufferedReader(new FileReader(fileName));

            String lineFromFile;
            int maxId = 0;
            StringBuilder newLine = new StringBuilder();
            while ((lineFromFile = readerFromFile.readLine()) != null) {
                int tempMax = Integer.parseInt(lineFromFile.substring(0, 8).trim());
                maxId = (maxId > tempMax) ? maxId : tempMax;
            }
            readerFromFile.close();

            newLine.append((maxId + 1));
            while (newLine.length() < 8) {newLine.append(' ');}
            if ((args[1].length() > 30)) {
                newLine.append(args[1], 0, 30);
            } else {
                newLine.append(args[1]);
            }
            while (newLine.length() < 38) {newLine.append(' ');}
            newLine.append(args[2]);
            while (newLine.length() < 46) {newLine.append(' ');}
            newLine.append(args[3]);
            while (newLine.length() < 50) {newLine.append(' ');}

            BufferedWriter writerToFile = new BufferedWriter(new FileWriter(fileName, true));
            writerToFile.newLine();
            writerToFile.write(newLine.toString());
            writerToFile.close();
        }
    }
}
