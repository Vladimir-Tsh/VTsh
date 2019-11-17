package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

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
                    switch (args[2]) {
                        case ("м"):
                            newPerson = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
                            allPeople.add(newPerson);
                            System.out.println(allPeople.indexOf(newPerson));
                            break;
                        case ("ж"):
                            newPerson = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
                            allPeople.add(newPerson);
                            System.out.println(allPeople.indexOf(newPerson));
                            break;
                        default:
                            System.out.println("no correct sex");
                            break;
                    }
                    break;
                case ("-u"):
                    id = Integer.parseInt(args[1]);
                    if (id >= 0 && id <= allPeople.size()) {
                        switch (args[3]) {
                            case ("м"):
                                allPeople.set(id, Person.createMale(args[2], new SimpleDateFormat("dd/MM/yyyy").parse(args[4])));
                                break;
                            case ("ж"):
                                allPeople.set(id, Person.createFemale(args[2], new SimpleDateFormat("dd/MM/yyyy").parse(args[4])));
                                break;
                            default:
                                System.out.println("no correct sex");
                                break;
                        }
                    }
                    break;
                case ("-d"):
                    id = Integer.parseInt(args[1]);
                    if (id >= 0 && id <= allPeople.size()) {
                        allPeople.get(id).setBirthDate(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setName(null);
                    }
                    break;
                case ("-i"):
                    char sex;
                    if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE)
                        sex = 'м';
                    else sex = 'ж';
                    SimpleDateFormat outDateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()
                            + ' ' + sex
                            + ' ' + outDateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                    break;
                default:
                    System.out.println("no correct args");
                    break;
            }
        }
//        char sex;
//        if (allPeople.get(2).getSex() == Sex.MALE)
//            sex = 'м';
//        else sex = 'ж';
//        SimpleDateFormat outDateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
//        System.out.println(allPeople.get(2).getName() + ' ' + sex + ' ' + outDateFormat.format(allPeople.get(2).getBirthDate()));
    }
}
