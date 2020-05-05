package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String tagName = args[0];
        BufferedReader reader;
        String fileHTML;
        String sHTML = "";
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileHTML = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(fileHTML));
            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()) {
                stringBuilder.append(reader.readLine()).append(" ");
            }
            reader.close();
            sHTML = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Document html = Jsoup.parse(sHTML);//, "", Parser.xmlParser());

//        System.out.println("<-------------------------------------------------------------------->");
//
//        Elements elements = html.getElementsByTag(tagName);
//        System.out.println(elements);

//        System.out.println("<-------------------------------------------------------------------->");

        ArrayList<Element> elements = new ArrayList<>(html.getAllElements());
        for (Element element : elements) {
            if (element.tagName().equals(tagName)) {
                System.out.println(element);
            }
            for (int i = 0; i < element.childNodeSize(); i++) {
                Node child = element.childNode(i);
                if (child.nodeName().equals("#comment"))
                    System.out.println(Jsoup.parse(child.attr("#comment")).getElementsByTag(tagName));
            }
        }
    }
}
