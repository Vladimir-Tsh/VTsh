package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        //List<String> addresses = new ArrayList<>();
        HashMap<String, String> cityfamily = new HashMap<>();
        while (true) {
            //String family = reader.readLine();
            String city = reader.readLine();
            //if (family.isEmpty()) break;
            if (city.isEmpty()) break;

            String family = reader.readLine();
            if (family.isEmpty()) break;

            //addresses.add(family);
            cityfamily.put(city, family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String getCity = reader.readLine();

        //if (0 <= houseNumber && houseNumber < addresses.size()) {
        //    String familyName = addresses.get(houseNumber);
        //    System.out.println(familyName);

        if (cityfamily.containsKey(getCity)) {
            String getFamily = cityfamily.get(getCity);
            System.out.println(getFamily);
        }
    }
}
