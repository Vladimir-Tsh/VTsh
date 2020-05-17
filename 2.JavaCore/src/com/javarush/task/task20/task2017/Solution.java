package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A a = null;
        try {
            Object o = objectStream.readObject();
            a = o instanceof  A ? (A) o : null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            return Objects.isNull(a) ? null : a;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
