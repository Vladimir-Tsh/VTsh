package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human grandfather1 = new Human();
        Human grandfather2 = new Human();
        Human grandmother1 = new Human();
        Human grandmother2 = new Human();

        child1.name = "ch1name";
        child1.sex = true;
        child1.age = 12;
        child2.name = "ch2name";
        child2.sex = true;
        child2.age = 17;
        child3.name = "ch3name";
        child3.sex = false;
        child3.age = 9;
        father.name = "fathername";
        father.sex = true;
        father.age = 35;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.name = "mothername";
        mother.sex = false;
        mother.age = 33;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        grandfather1.name = "grandfather1name";
        grandfather1.sex = true;
        grandfather1.age = 55;
        grandfather1.children.add(father);
        grandfather2.name = "grandfather2name";
        grandfather2.sex = true;
        grandfather2.age = 53;
        grandfather2.children.add(mother);
        grandmother1.name = "grandmother1name";
        grandmother1.sex = false;
        grandmother1.age = 53;
        grandmother1.children.add(father);
        grandmother2.name = "grandmother2name";
        grandmother2.sex = false;
        grandmother2.age = 51;
        grandmother2.children.add(mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
