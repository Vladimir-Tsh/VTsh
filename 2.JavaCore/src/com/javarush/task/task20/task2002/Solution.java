package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User user = new User();
            user.setBirthDate(new Date());
            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            user.setMale(false);
            javaRush.users.add(user);

            User user1 = new User();
            user1.setBirthDate(new Date());
            user1.setCountry(User.Country.UKRAINE);
            user1.setFirstName("Petr");
            user1.setLastName("Petrov");
            user1.setMale(true);
            javaRush.users.add(user1);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            String lineSeparator = ":";
            for (User userJR : javaRush.users) {
                System.out.println(userJR.getFirstName() + lineSeparator +
                                userJR.getLastName() + lineSeparator +
                                userJR.getBirthDate() + lineSeparator +
                                userJR.isMale() + lineSeparator +
                                userJR.getCountry());
            }
            System.out.println("<------------------------------->");
            for (User userLO : loadedObject.users) {
                System.out.println(userLO.getFirstName() + lineSeparator +
                        userLO.getLastName() + lineSeparator +
                        userLO.getBirthDate() + lineSeparator +
                        userLO.isMale() + lineSeparator +
                        userLO.getCountry());
            }

            if (javaRush.equals(loadedObject)) System.out.println("OK!");
            else System.out.println("Bad...");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            String lineSeparator = System.getProperty("line.separator");
            outputStream.write((users.size() + lineSeparator).getBytes());
            for (User user : users) {
                outputStream.write((user.getFirstName() + lineSeparator +
                                    user.getLastName() + lineSeparator +
                                    user.getBirthDate().getTime() + lineSeparator +
                                    user.isMale() + lineSeparator +
                                    user.getCountry() + lineSeparator).getBytes());
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            StringBuilder s = new StringBuilder();
            int i;
            while ((i = inputStream.read()) != -1)
                s.append((char) i);
            Pattern pattern = Pattern.compile(System.getProperty("line.separator"));
            ArrayList<String> lines = new ArrayList<>(Arrays.asList(pattern.split(s)));
            if (Integer.parseInt(lines.get(0)) > 0) {
                for (i = 1; i < 5 * Integer.parseInt(lines.get(0)) + 1; i += 5) {
                    User user = new User();
                    user.setFirstName(lines.get(i));
                    user.setLastName(lines.get(i + 1));
                    user.setBirthDate(Date.from(Instant.ofEpochMilli(Long.parseLong(lines.get(i + 2)))));
                    user.setMale(Boolean.parseBoolean(lines.get(i + 3)));
                    user.setCountry(User.Country.valueOf(lines.get(i + 4)));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
