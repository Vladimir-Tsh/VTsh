package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String strParams = url.substring(url.indexOf('?') + 1);
        Pattern patternSplitParams = Pattern.compile("&");
        Pattern patternSplitParamName = Pattern.compile("=");

        //System.out.println(strParams);

        String[] stringsParam = patternSplitParams.split(strParams);
        String objVal = null;

        for (String s : stringsParam) {
            //System.out.println(s);
            String[] stringsParamVal = patternSplitParamName.split(s);
            System.out.print(stringsParamVal[0] + ' ');
            if (stringsParamVal[0].equals("obj")) {
                objVal = stringsParamVal[1];
                //System.out.println(objVal);
            }
        }

        System.out.print('\n');

        if (objVal != null) {
                if (objVal.matches("^[-+.]?[0-9]+[.]?[0-9]*") || objVal.matches("^[-+.]?[0-9]*[.]?[0-9]+")) {
                //&& (objVal.matches("[-+]?[0-9]+[.][0-9]*") || objVal.matches("[-+]?[0-9]*[.][0-9]+"))
                    alert(Double.parseDouble(objVal));
                } else {
                    alert(objVal);
                }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
