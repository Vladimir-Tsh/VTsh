package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        List<Thread> threads = new ArrayList<Thread>();
        while (!((fileName = reader.readLine()).equals("exit"))) {
//            ReadThread t = new ReadThread(fileName);
                    new ReadThread(fileName).start();
//            threads.add(t);
//            t.start();
        }
//
//        for (Thread t :
//                threads) {
//            t.join();
//        }
//
//        System.out.println(resultMap.size());
//        for (String s :
//                resultMap.keySet()) {
//            System.out.println(s + " " + resultMap.get(s));
//        }
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
            fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        }
        // implement file reading here - реализуйте чтение из файла тут
        private BufferedReader fileReader;
        private String fileName;

        @Override
        public void run() {
            Map<Integer, Integer> readMap = new HashMap<>();
            int tempByte;

            try {
                while ((tempByte = fileReader.read()) != -1) {
                    if (readMap.containsKey(tempByte)) {
                        int tempCount = readMap.get(tempByte);
                        readMap.replace(tempByte, ++tempCount);
                    } else {
                        readMap.put(tempByte, 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            List<Integer> sortValuesOfMap = new ArrayList<>(readMap.values());
            Collections.sort(sortValuesOfMap);

            int maxValue = sortValuesOfMap.get(sortValuesOfMap.size() - 1);

            synchronized (resultMap) {
                for (int keyOfReadMap : readMap.keySet()) {
                    if (readMap.get(keyOfReadMap) == maxValue) {
                        resultMap.put(fileName, keyOfReadMap);
                    }
                }
            }
        }
    }
}
