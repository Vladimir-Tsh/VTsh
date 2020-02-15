package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedReader readerFromFile = new BufferedReader(new FileReader(fileName));

            String lineFromFile;
            Map<Integer, String> linesFromFile = new LinkedHashMap<>();
            while ((lineFromFile = readerFromFile.readLine()) != null) {
                linesFromFile.put(Integer.parseInt(lineFromFile.substring(0, 8).trim()), lineFromFile);
            }
            readerFromFile.close();

//            for (String s: linesFromFile.values()
//                 ) {
//                System.out.println(s);
//            }

            if (args[0].equals("-d")) {
                linesFromFile.remove(Integer.parseInt(args[1]));
            }

            if (args[0].equals("-u")) {
                StringBuilder newLine = new StringBuilder();

                newLine.append(args[1]);
                while (newLine.length() < 8) {newLine.append(' ');}
                if ((args[2].length() > 30)) {
                    newLine.append(args[2], 0, 30);
                } else {
                    newLine.append(args[2]);
                }
                while (newLine.length() < 38) {newLine.append(' ');}
                newLine.append(args[3]);
                while (newLine.length() < 46) {newLine.append(' ');}
                newLine.append(args[4]);
                while (newLine.length() < 50) {newLine.append(' ');}

                linesFromFile.replace(Integer.parseInt(args[1]), newLine.toString());
            }

//            for (String s: linesFromFile.values()
//                 ) {
//                System.out.println(s);
//            }
            BufferedWriter writerToFile = new BufferedWriter(new FileWriter(fileName));

            for (String s: linesFromFile.values()
                 ) {
                writerToFile.write(s);
                writerToFile.newLine();
            }

            writerToFile.close();
        }
    }
}
