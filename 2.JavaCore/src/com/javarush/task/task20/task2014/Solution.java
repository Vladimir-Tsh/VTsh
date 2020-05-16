package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
//        System.out.println(new Solution(4));

        String file = "D:\\Temp\\task2014\\object.dat";

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        Solution savedObject = null;
        Solution loadedObject = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            savedObject = new Solution(12);
            objectOutputStream.writeObject(savedObject);
            objectOutputStream.close();
            fileOutputStream.close();

            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            loadedObject = (Solution) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\"" + Objects.requireNonNull(savedObject).string + "\" == "
                + "\"" + Objects.requireNonNull(loadedObject).string + "\" : "
                + Objects.requireNonNull(savedObject).string.equals(Objects.requireNonNull(loadedObject).string));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
