package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        int id;
        Person newPerson;
        if (args.length > 0) {
            switch (args[0]) {
                case ("-c"):
                    for (int i = 0; i < (args.length - 1)/3; i++) {
                        switch (args[2 + 3 * i]) {
                            case ("м"):
                                newPerson = Person.createMale(args[1 + 3 * i], new SimpleDateFormat("dd/MM/yyyy").parse(args[3 + 3 * i]));
                                allPeople.add(newPerson);
                                System.out.println(allPeople.indexOf(newPerson));
                                break;
                            case ("ж"):
                                newPerson = Person.createFemale(args[1 + 3 * i], new SimpleDateFormat("dd/MM/yyyy").parse(args[3 + 3 * i]));
                                allPeople.add(newPerson);
                                System.out.println(allPeople.indexOf(newPerson));
                                break;
                            default:
                                System.out.println("no correct sex");
                                break;
                        }
                    }
                    break;
                case ("-u"):
                    for (int i = 0; i < (args.length - 1)/4; i++) {
                        id = Integer.parseInt(args[1 + 4 * i]);
                        if (id >= 0 && id <= allPeople.size()) {
                            switch (args[3 + 4 * i]) {
                                case ("м"):
                                    allPeople.set(id, Person.createMale(args[2 + 4 * i], new SimpleDateFormat("dd/MM/yyyy").parse(args[4 + 4 * i])));
                                    break;
                                case ("ж"):
                                    allPeople.set(id, Person.createFemale(args[2 + 4 * i], new SimpleDateFormat("dd/MM/yyyy").parse(args[4 + 4 * i])));
                                    break;
                                default:
                                    System.out.println("no correct sex");
                                    break;
                            }
                        }
                    }
                    break;
                case ("-d"):
                    for (int i = 0; i < args.length - 1; i++) {
                        id = Integer.parseInt(args[1 + i]);
                        if (id >= 0 && id <= allPeople.size()) {
                            allPeople.get(id).setBirthDate(null);
                            allPeople.get(id).setSex(null);
                            allPeople.get(id).setName(null);
                        }
                    }
                    break;
                case ("-i"):
                    for (int i = 0; i < args.length - 1; i++) {
                        char sex;
                        if (allPeople.get(Integer.parseInt(args[1 + i])).getSex() == Sex.MALE)
                            sex = 'м';
                        else sex = 'ж';
                        SimpleDateFormat outDateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                        System.out.println(allPeople.get(Integer.parseInt(args[1 + i])).getName()
                                + ' ' + sex
                                + ' ' + outDateFormat.format(allPeople.get(Integer.parseInt(args[1 + i])).getBirthDate()));
                    }
                    break;
                default:
                    System.out.println("no correct args");
                    break;
            }
        }
    }
}
