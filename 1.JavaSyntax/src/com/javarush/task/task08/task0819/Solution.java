package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //printCats(cats);
        //напишите тут ваш код. step 3 - пункт 3

        //Cat myCat = new Cat();
        //Cat myCat2 = new Cat("Дымок");

        //System.out.println(myCat);
        //System.out.println(myCat2);
        //myCat2.setName("Дымок Первый");
        //System.out.println(myCat2);
        Iterator<Cat> iter = cats.iterator();
        Cat cat = new Cat();
        while (iter.hasNext()){
            cat = iter.next();
        }
        cats.remove(cat);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> sCats = new HashSet<>();
        sCats.add(new Cat());
        sCats.add(new Cat());
        sCats.add(new Cat());
        return sCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat: cats)
            System.out.println(cat);
    }

    // step 1 - пункт 1
    public static class Cat{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Cat(String name){ this.setName(name); }
        public Cat() { this("Мурзик"); }
        //public String toString() { return (String)("Cat: " + this.getName()); }
    }
}
