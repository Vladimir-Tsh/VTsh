package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human fGrandFather = new Human("Дед Иван", true, 60);
        Human fGrandMother = new Human("Баба Маша", false, 59);
        Human mGrandFather = new Human("Дед Пётр", true, 55);
        Human mGrandMother = new Human("Баба Валя", false, 54);
        Human father = new Human("Отец Сергей", true, 30, fGrandFather, fGrandFather);
        Human mother = new Human("Мать Оля", false, 29, mGrandFather, mGrandMother);
        Human son1 = new Human("Сын Коля", true, 10, father, mother);
        Human son2 = new Human("Сын Вася", true, 8, father, mother);
        Human daughter = new Human("Дочь Юля", false, 7, father, mother);

        System.out.println(fGrandFather);
        System.out.println(fGrandMother);
        System.out.println(mGrandFather);
        System.out.println(mGrandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}