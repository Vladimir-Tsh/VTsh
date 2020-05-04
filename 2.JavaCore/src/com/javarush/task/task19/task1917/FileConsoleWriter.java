package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for (int i = off; i < off + len; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.print((char) c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.print(str);
    }

    public void write(String str, int off, int len) throws IOException {
        /*char[] buf = new char[str.length()];
        str.getChars(0, str.length(), buf, 0);
        this.write(buf, off, len);*/
        fileWriter.write(str, off, len);
        char[] buf = new char[str.length()];
        str.getChars(0, str.length(), buf, 0);
        for (int i = off; i < off + len; i++) {
            System.out.print(buf[i]);
        }
    }

    public void write(char[] cbuf) throws IOException {
//        this.write(cbuf, 0, cbuf.length);
        fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) {
        /*String string = "qwertyuiopasdfghjklzxcvbnm";
        char[] buffer = new char[string.length()];
        string.getChars(0, string.length(), buffer, 0);
        try {
            FileConsoleWriter fileConsoleWriter = new FileConsoleWriter("D:/Temp/task1917/file.txt");
            fileConsoleWriter.write(buffer, 5, 5);
            fileConsoleWriter.write(buffer[11]);
            fileConsoleWriter.write("STROKA");
            fileConsoleWriter.write("NEWSTROKA", 1, 3);
            fileConsoleWriter.write(buffer);
            fileConsoleWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
