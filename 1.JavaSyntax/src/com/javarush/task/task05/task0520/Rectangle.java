package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    protected int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public Rectangle(int top, int left, int side){
        this.top = top;
        this.left = left;
        width = side;
        height = side;
    }

    public Rectangle(Rectangle copyRec){
        top = copyRec.top;
        left = copyRec.left;
        width = copyRec.width;
        height = copyRec.height;
    }

    public static void main(String[] args) {

    }
}
