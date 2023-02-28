package com.woniuxy.day015;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            p.load(new FileReader("src\\DocTest\\p.property"));
            System.out.println(p.get("name"));  //Object key
            System.out.println(p.getProperty("name"));  //String

            p.setProperty("city", "城市");
            p.store(new FileWriter("src\\DocTest\\p.property"), "by Jav7");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
