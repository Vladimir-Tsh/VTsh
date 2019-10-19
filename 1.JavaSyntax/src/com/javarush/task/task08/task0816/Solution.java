package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone1", df.parse("JUNE 2 1980"));
        map.put("Stallone2", df.parse("JUNE 3 1990"));
        map.put("Stallone3", df.parse("JUNE 10 1980"));
        map.put("Stallone4", df.parse("JUNE 11 1981"));
        map.put("Stallone5", df.parse("JULY 1 1993"));
        map.put("Stallone6", df.parse("JULY 21 1988"));
        map.put("Stallone7", df.parse("AUG 15 1986"));
        map.put("Stallone8", df.parse("SEP 1 1980"));
        map.put("Stallone9", df.parse("FEB 1 1980"));
        return  map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        //DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            HashMap.Entry<String, Date> entry = (HashMap.Entry<String, Date>) itr.next();
            //получить ключ
            String key = entry.getKey();
            //получить значение
            Date value = entry.getValue();
            if (value.getMonth() == 5 || value.getMonth() == 6 || value.getMonth() == 7)
                itr.remove();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Date> myMap = new HashMap<String, Date>();
        try {
            myMap = createMap();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        removeAllSummerPeople(myMap);
    }
}
