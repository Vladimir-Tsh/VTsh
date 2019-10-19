package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    protected int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int top, int left, int side){
        this.top = top;
        this.left = left;
        width = side;
        height = side;
    }

    public void initialize(Rectangle rec){
        top = rec.top;
        left = rec.left;
        width = rec.width;
        height = rec.height;
    }

    public static void main(String[] args) {

    }
}
