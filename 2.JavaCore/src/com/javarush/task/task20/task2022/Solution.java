package com.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;

    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(this.fileName, true);
        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        try {
            Solution testSolution1 = new Solution("D://Temp//task2022//file.txt");
            testSolution1.writeObject("some data 1");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://Temp//task2022//file1.txt"));
            oos.writeObject(testSolution1);
            testSolution1.close();
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://Temp//task2022//file1.txt"));
            Solution testSolution2 = (Solution) ois.readObject();
            testSolution2.writeObject("some data 2");
            testSolution2.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
