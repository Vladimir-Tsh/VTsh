package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("file", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
//            Human ivanov = new Human("Ivanov");
//            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

            if (ivanov.equals(somePerson)) System.out.println("OK!");
            else System.out.println("Bad...");

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            String lineSeparator = System.getProperty("line.separator");
            outputStream.write((name + lineSeparator).getBytes());
            outputStream.write((assets.size() + lineSeparator).getBytes());
            for (Asset asset : assets) {
                outputStream.write((asset.getName() + lineSeparator + asset.getPrice() + lineSeparator).getBytes());
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
            name = lines.get(0);
            if (Integer.parseInt(lines.get(1)) > 0) {
                for (i = 0; i < Integer.parseInt(lines.get(1)); i++)
                    assets.add(new Asset(lines.get(2 * i + 2), Double.parseDouble(lines.get(2 * i + 3))));
            }
        }
    }
}
