package com.stu.collection.stuMAP;

import java.awt.*;
import java.util.Properties;
import java.util.Set;

import static java.lang.System.getProperties;

public class Test {
    public static void main(String[] args) {
//        StuMAP sm = new StuMAP();
//        sm.mapDemo();

        Properties prop =  getProperties();

        Set<String> namesSte = prop.stringPropertyNames();

        for (String names : namesSte){
            String value = prop.getProperty(names);
            System.out.println(names+" ："+value);
        }
    }
}
