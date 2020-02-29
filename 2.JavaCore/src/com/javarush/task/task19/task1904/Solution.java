package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            ArrayList<String> lineSplit = new ArrayList<>(Arrays.asList(line.split(" ")));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(lineSplit.get(3) + " " + lineSplit.get(4) + " " + lineSplit.get(5));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(lineSplit.get(1), lineSplit.get(2), lineSplit.get(0), date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
